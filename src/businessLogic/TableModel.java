package businessLogic;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {
    private String[][] data ;//author title
    private String[] columns;

    public TableModel(String[][] data, String[] columns){
        this.data = data;
        this.columns = columns;
    }

    public int getRowCount(){
        return data.length;
    }

    public int getColumnCount(){
        return columns.length;
    }

    public String getValueAt(int i, int j){
        return data[i][j];
    }

    public String getColumnName(int col){
        return columns[col];
    }




}
