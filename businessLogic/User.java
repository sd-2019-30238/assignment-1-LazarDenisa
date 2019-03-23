package businessLogic;

public class User {

    private int id;
    private int age;
    private String firstName;
    private String lastName;
    private String address;


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
}
