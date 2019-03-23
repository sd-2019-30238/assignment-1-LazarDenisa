package businessLogic;

public class PaymentPlan {

    protected String type;
    protected int amount;

    protected String showInfo(){
        return "The type of payment is : " + this.type + ", having a total cost of : " + this.amount + "dollars";
    }

    protected PaymentPlan(String option) {
       switch(option){
           case "w" : this.type = "weekly"; this.amount=20; break;
           case "m" : this.type = "monthly"; this.amount=80; break;
           case "y" : this.type = "yearly"; this.amount=960; break;
           default : this.type="";this.amount=0;
       }
    }

}
