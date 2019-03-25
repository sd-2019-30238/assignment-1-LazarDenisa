package businessLogic;

public class Staff {
    private int idStaff;
    private String firstName;
    private String lastName;
    private Library l;


    public Staff(int idStaff, String firstName, String lastName) {
        this.idStaff = idStaff;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getIdStaff() {
        return idStaff;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void validatePaymentPlan(PaymentPlan p){
        l.increaseTotalIncome(p.getAmount());
    }

    public void refusePaymentPlan(Account a){

        PaymentPlan p;
        p=a.getPayPlan();
        p= new PaymentPlan();

    }

    public void validateReturn(Book b){
        l.removeFromUnavailable(b);
        l.addToAvailable(b);
    }


}
