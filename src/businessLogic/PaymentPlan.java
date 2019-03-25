package businessLogic;

public class PaymentPlan {

    private String type;
    private int amount;

    public String showInfo(){
        return "The type of payment is : " + this.type + ", having a total cost of : " + this.amount + "dollars";
    }

    public PaymentPlan(String option) {
       switch(option){
           case "w" : this.type = "weekly"; this.amount=20; break;
           case "m" : this.type = "monthly"; this.amount=80; break;
           case "y" : this.type = "yearly"; this.amount=960; break;
       }
    }

    public PaymentPlan(){
        this.type="";
        this.amount=0;
    }

    public String getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }
}
