package dataAccessLayer;

import businessLogic.Book;

import java.sql.*;
import java.util.ArrayList;

public class BookDAO {

    public String filterByTitle(String title) throws SQLException
    {
       String filtered="";
       ArrayList<Book> books = new ArrayList<Book>();
       try{
          Connection c = ConnectionFactory.getConnection();
          PreparedStatement ps = c.prepareStatement("SELECT * FROM books WHERE title=?");
          ps.setString(1,title);
          ResultSet rs = ps.executeQuery();
          while(rs.next()){
              Book book = new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getBoolean(5),rs.getString(6));
              books.add(book);
          }


       }catch (SQLException e){
           System.out.println("Fail");
       }

       for(Book b: books){
           filtered+= "TITLE: " + b.getTitle() + ", AUTHOR: " + b.getAuthor() + "\n";
       }

       return filtered;

    }

    public String filterByGenre(String genre) throws SQLException
    {
        String filtered="";
        ArrayList<Book> books = new ArrayList<Book>();
        try{
            Connection c = ConnectionFactory.getConnection();
            PreparedStatement ps = c.prepareStatement("SELECT * FROM books WHERE genre=?");
            ps.setString(1,genre);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Book book = new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getBoolean(5),rs.getString(6));
                books.add(book);
            }


        }catch (SQLException e){
            System.out.println("Fail");
        }

        for(Book b: books){
            filtered+= "TITLE: " + b.getTitle() + ", AUTHOR: " + b.getAuthor() + " " + ", GENRE: " + b.getGenre()+"\n";
        }

        return filtered;

    }

    public String filterByAuthor(String author) throws SQLException
    {
        String filtered="";
        ArrayList<Book> books = new ArrayList<Book>();
        try{
            Connection c = ConnectionFactory.getConnection();
            PreparedStatement ps = c.prepareStatement("SELECT * FROM books WHERE author=?");
            ps.setString(1,author);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Book book = new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getBoolean(5),rs.getString(6));
                books.add(book);
            }


        }catch (SQLException e){
            System.out.println("Fail");
        }

        for(Book b: books){
            filtered+= "TITLE: " + b.getTitle() + " AUTHOR: " + b.getAuthor() + "\n";
        }

        return filtered;

    }

    public String filterByReleaseDate(String releaseDate) throws SQLException
    {
        String filtered="";
        ArrayList<Book> books = new ArrayList<Book>();
        try{
            Connection c = ConnectionFactory.getConnection();
            PreparedStatement ps = c.prepareStatement("SELECT * FROM books WHERE release_date=?");
            ps.setString(1,releaseDate);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Book book = new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getBoolean(5),rs.getString(6));
                books.add(book);
            }


        }catch (SQLException e){
            System.out.println("Fail");
        }

        for(Book b: books){
            filtered+= "TITLE: " + b.getTitle() + " AUTHOR: " + b.getAuthor() +"\n";
        }

        return filtered;

    }


}
