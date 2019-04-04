package businessLogic;

import java.util.ArrayList;

public class User {

    private int id;
    private int age;
    private String firstName;
    private String lastName;
    private String address;
    private Account a;

    //id does not change
    //do not keep track of birth dates and ages for now


//getters and setters
    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //constructor

    public User(int id, int age, String firstName, String lastName, String address) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public User(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public void createAccount(int idAcc, String user, String pass, String payOption, String cashOnly){
        this.a = new Account();
        a.setIdAccount(id);
        a.setUsername(user);
        a.setPassword(pass);
        a.choosePaymentPlan(payOption,cashOnly);
    }



}
