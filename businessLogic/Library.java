package businessLogic;

import java.util.ArrayList;

public class Library {

    private int totalIncome;
    private ArrayList<Account> waitingList = new ArrayList<Account>();
    private ArrayList<Book> availableBooks = new ArrayList<Book>();
    private ArrayList<Book> unavailableBooks = new ArrayList<Book>();

    public Library() {
        this.totalIncome = 0;
    }

    public void joinWaitingList(Account a){
        this.waitingList.add(a);
    }

    public void tryAssignNext(Account a, Book b){
        if(b.isAvailable()){
            this.waitingList.remove(a);
            this.waitingList.get(0).borrowBook(b);
        }
    }

    public void increaseTotalIncome(int sum){

        this.totalIncome += sum;
    }

    public void addToUnavailable(Book b){
        this.unavailableBooks.add(b);
    }

    public void removeFromUnavailable(Book b){
        this.unavailableBooks.remove(b);
    }

    public void addToAvailable(Book b){
        this.availableBooks.add(b);
    }

    public void removeFromAvailable(Book b){
        this.availableBooks.remove(b);
    }

    public ArrayList<Book> filterLibrary(String criterion, String releaseDate, String author, String title, String genre){

        ArrayList<Book> result= new ArrayList<Book>();

        if(criterion.equals("releaseDate")){
            result = filterByRelease(releaseDate);
        }

        if(criterion.equals("author")){
            result = filterByAuthor(author);
        }

        if(criterion.equals("title")){
            result = filterByTitle(title);
        }

        if(criterion.equals("genre")){
            result = filterByGenre(genre);
        }

        return result;
    }

    public ArrayList<Book> filterByRelease(String releaseDate){
        ArrayList<Book> aux = new ArrayList<Book>();
        ArrayList<Book> filtered = new ArrayList<Book>();

        for(Book available: availableBooks){
            aux.add(available);
        }

        for(Book unavailable: unavailableBooks){
            aux.add(unavailable);
        }

        for(Book b : aux){
            if(b.getReleaseDate().equals(releaseDate)){
                filtered.add(b);
            }
        }

        return filtered;
    }

    public ArrayList<Book> filterByAuthor(String author){
        ArrayList<Book> aux = new ArrayList<Book>();
        ArrayList<Book> filtered = new ArrayList<Book>();

        for(Book available: availableBooks){
            aux.add(available);
        }

        for(Book unavailable: unavailableBooks){
            aux.add(unavailable);
        }

        for(Book b : aux){
            if(b.getAuthor().equals(author)){
                filtered.add(b);
            }
        }

        return filtered;
    }

    public ArrayList<Book> filterByTitle(String title){
        ArrayList<Book> aux = new ArrayList<Book>();
        ArrayList<Book> filtered = new ArrayList<Book>();

        for(Book available: availableBooks){
            aux.add(available);
        }

        for(Book unavailable: unavailableBooks){
            aux.add(unavailable);
        }

        for(Book b: aux){
            if(b.getTitle().equals(title)){
                filtered.add(b);
            }
        }

        return filtered;
    }

    public ArrayList<Book> filterByGenre(String genre){
        ArrayList<Book> aux = new ArrayList<Book>();
        ArrayList<Book> filtered = new ArrayList<Book>();

        for(Book available: availableBooks){
            aux.add(available);
        }

        for(Book unavailable: unavailableBooks){
            aux.add(unavailable);
        }

        for(Book b : aux){
            if(b.getGenre().equals(genre)){
                filtered.add(b);
            }
        }

        return filtered;
    }




}
