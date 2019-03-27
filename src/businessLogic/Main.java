package businessLogic;

public class Main {

    public static void main(String[] args){
        RecommendationFactory rf = new RecommendationFactory();
        Recommendation book = rf.makeRecommendation("RoMANce");
        book.getRecommendation();
    }



}
