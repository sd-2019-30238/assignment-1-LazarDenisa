package dataAccessLayer;

import businessLogic.TableModel;

import javax.xml.transform.Result;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class AbstractDAO<T>{

    private final Class<T> type;

    public AbstractDAO(){
        this.type = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    private String createSelectQuery(String field){
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append(" * ");
        sb.append(" FROM ");
        sb.append(" WHERE " + field + " =?");
        return sb.toString();
    }

    private String createFindAllQuery(){
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append(" * ");
        sb.append(" FROM ");
        sb.append(type.getSimpleName().toLowerCase());

        return sb.toString();
    }

    private String createInsertQuery() throws SQLException{

        StringBuilder sb  = new StringBuilder();
        sb.append("INSERT into ");
        sb.append(type.getSimpleName().toLowerCase());
        sb.append("(");

        for(int i=1; i<getColumns().length;i++){
            sb.append(getColumns()[i]);
            sb.append(",");
        }

        sb.deleteCharAt(sb.length()-1);
        sb.append(")");

        sb.append(" VALUES(");

        for(int i=0;i<getColumns().length-1;i++){
            sb.append("?");
            sb.append(",");
        }

        sb.deleteCharAt(sb.length()-1);
        sb.append(")");

        return sb.toString();
    }

    private String createUpdateQuery(String field1, String field2){

        StringBuilder sb = new StringBuilder();

        sb.append("UPDATE ");
        sb.append(type.getSimpleName().toLowerCase());
        sb.append(" SET ");
        sb.append(field1 + "=" + "?");
        sb.append(" WHERE");
        sb.append(field2 + "=" + "?");

        return sb.toString();

    }

    private String createDeleteQuery(String field){

        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ");
        sb.append(type.getSimpleName().toLowerCase());
        sb.append(" WHERE ");
        sb.append(field + "=?");

        return sb.toString();
    }

    public List<T> findAll() throws SQLException{

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String query = createFindAllQuery();

        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            return createObjects(resultSet);
        }catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            Useful.close(resultSet);
            Useful.close(statement);
            Useful.close(connection);
        }

        return null;
    }

    private String[] getColumns() throws SQLException{
            String columnName[];
            Connection connection  = null;
            PreparedStatement statement = null;
            ResultSetMetaData rsmd = null;
            ResultSet resultSet = null;
            String query = createFindAllQuery();

            try{
                connection = ConnectionFactory.getConnection();
                statement = connection.prepareStatement(query);
                resultSet = statement.executeQuery();

                rsmd = resultSet.getMetaData();
                int columnCount = rsmd.getColumnCount();
                columnName = new String[columnCount + 1];

                for(int i=1;i<=columnCount;i++){
                    columnName[i] = rsmd.getColumnName(i);
                }

                return columnName;

            }catch(SQLException e){
                e.printStackTrace();
            }

            finally{
                Useful.close(resultSet);
                Useful.close(statement);
                Useful.close(connection);
            }

            return null;
    }

    public String[][] getData(List<T> objects) throws SQLException,IllegalAccessException{
        int line=0;
        int nrColumns = getColumns().length-1;
        String[][] data = new String[20][nrColumns+1];

        for(Object object : objects){
            int column = 0;
            for(Field field : object.getClass().getDeclaredFields()){
                field.setAccessible(true);
                Object value;

                try{
                    value = field.get(object);
                    data[line][column] = value.toString();
                    column++;
                }catch(IllegalArgumentException e){
                    e.printStackTrace();
                }catch(IllegalAccessException e){
                    e.printStackTrace();
                }
            }

            line++;
        }

        return data;

    }

    public TableModel createTable(List<T> objects) throws SQLException, IllegalAccessException {

        TableModel table;
        String[] columns = getColumns();
        String[]goodColumns = new String[columns.length-1];

        int j=0;
        for(int i=1;i<columns.length;i++){
            goodColumns[j] = columns[i];
            j += 1;
            System.out.println(columns[i]);
        }

        for(String s : goodColumns){
            System.out.println(s);
        }

        String[][] data =getData(objects);

        table = new TableModel(data,goodColumns);

        return table;
    }

    public T findByTitle(String title) throws SQLException{
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String query = createSelectQuery("title");
        System.out.println(query);

        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            statement.setString(1,title);
            resultSet = statement.executeQuery();

            return createObjects(resultSet).get(0);
        }catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            Useful.close(resultSet);
            Useful.close(statement);
            Useful.close(connection);
        }

        return null;
    }

    public List<T> createObjects(ResultSet resultSet){
        List<T> list = new ArrayList<T>();

        try{
            while (resultSet.next()) {
                T instance = type.newInstance();
                for(Field field : type.getDeclaredFields()){
                    Object value = resultSet.getObject(field.getName());
                    PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(),type);
                    Method method = propertyDescriptor.getWriteMethod();
                    method.invoke(instance,value);
                }

                list.add(instance);


            }
        }catch(InstantiationException e){
            e.printStackTrace();
        }catch(IllegalAccessException e){
            e.printStackTrace();
        }catch(SecurityException e){
            e.printStackTrace();
        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }catch(InvocationTargetException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }catch(IntrospectionException e){
            e.printStackTrace();
        }

        return list;
    }

    public T insert(List<T> list) throws SQLException{
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try{
            connection = ConnectionFactory.getConnection();
            connection.setAutoCommit(false);
            String query = createInsertQuery();
            preparedStatement = connection.prepareStatement(query);
            for(T instance : list){
                int i=0;
                for(Field field : type.getDeclaredFields()){
                    PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(),type);
                    Method method = propertyDescriptor.getReadMethod();
                    Object value = method.invoke(instance);
                    preparedStatement.setObject(++i,value);
                }

                preparedStatement.addBatch();



            }

            preparedStatement.executeBatch();
            connection.commit();
            Useful.close(resultSet);
            Useful.close(preparedStatement);
            Useful.close(connection);


            return list.get(0);
        }catch(IllegalAccessException e){
            e.printStackTrace();
        }catch(SecurityException e){
            e.printStackTrace();
        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }catch(InvocationTargetException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }catch(IntrospectionException e){
            e.printStackTrace();
        }
        finally{
            Useful.close(resultSet);
            Useful.close(preparedStatement);
            Useful.close(connection);
        }

        return null;
    }

    public T update(T object, String setWhat, String setWhere, String val1, String val2) throws SQLException{
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String query = createUpdateQuery(setWhat,setWhere);

        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            statement.setString(1,val1);
            statement.setString(2,val2);
            statement.executeUpdate();

            return object;
        }catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            Useful.close(resultSet);
            Useful.close(statement);
            Useful.close(connection);
        }

        return null;
    }

    public void delete(T object, String field, String value) throws SQLException{
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String query = createDeleteQuery(field);

        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            statement.setString(1,value);
            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            Useful.close(resultSet);
            Useful.close(statement);
            Useful.close(connection);
        }
    }

}
