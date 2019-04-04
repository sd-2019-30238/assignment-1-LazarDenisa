package businessLogic;

public class RecommendationFactory {

    public Recommendation makeRecommendation(String criterion){

        if(criterion==null){
            return null;
        }

        if(criterion.equalsIgnoreCase("AUTHOR")){
            return new RecommendationByAuthor();
        }

        if(criterion.equalsIgnoreCase("GENRE")){
            return new RecommendationByGenre();
        }

        return null;
    }
}
