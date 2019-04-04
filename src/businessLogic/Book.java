package businessLogic;

public class Book {

    private int isbn;
    private String title;
    private String author;
    private String genre;
    private boolean availability;
    private String releaseDate; // something like "11/01/2007"

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

    public String getReleaseDate() {
        return releaseDate;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    
    public Book(int isbn, String title, String author, String genre, boolean availability, String releaseDate) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availability=availability;
        this.releaseDate = releaseDate;
    }

    public Book(String title, String author){
        this.title=title;
        this.author=author;
    }
}
