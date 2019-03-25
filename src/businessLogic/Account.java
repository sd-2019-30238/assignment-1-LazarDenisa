package businessLogic;


import java.util.ArrayList;


public class Account {


    private String username;
    private String password;
    private PaymentPlan payPlan;
    private ArrayList<Book> borrowedBooks;
    private Library l;
    Staff s;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Account(){
        this.username="";
        this.password="";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PaymentPlan getPayPlan() {
        return payPlan;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void choosePaymentPlan(String option, String cashOnly){
        if(cashOnly.equals("CASH")){
            this.payPlan = new PaymentPlan(option);
            s.validatePaymentPlan(this.payPlan);
        }else{
            s.refusePaymentPlan(this);
        }

    }

    public void borrowBook(Book b){
        if(b.isAvailable()){
            this.borrowedBooks.add(b);
            b.setAvailability(false);
            l.removeFromAvailable(b);
            l.addToUnavailable(b);
        }else{
           l.joinWaitingList(this);
           l.tryAssignNext(this, b);
        }
    }

    public void returnBook(Book b){
        this.borrowedBooks.remove(b);
        b.setAvailability(true);
        s.validateReturn(b);
    }



}
