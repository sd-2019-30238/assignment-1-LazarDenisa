package businessLogic;

public class Book {

    private int isbn;
    private String title;
    private String author;
    private String genre;

    //there is no reason for a book to change its isbn, title, author, genre
    //so that is why setters do not exist

    public int getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public Book(int isbn, String title, String author, String genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
}
