package businessLogic;

public class Account {

    private String username;
    private String password;
    private PaymentPlan payPlan;

    public Account(String username, String password, String option) {
        this.username = username;
        this.password = password;
        this.payPlan = new PaymentPlan(option);
    }
}
