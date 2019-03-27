package businessLogic;

public class RecommendationFactory {

    public Recommendation makeRecommendation(String criterion){

        if(criterion==null){
            return null;
        }

        if(criterion.equalsIgnoreCase("NOVEL")){
            return new NovelRecommendation();
        }

        if(criterion.equalsIgnoreCase("ROMANCE")){
            return new RomanceRecommendation();
        }

        if(criterion.equalsIgnoreCase("SF")){
            return new SFRecommendation();
        }

        if(criterion.equalsIgnoreCase("LIFESTYLE")){
            return new LifestyleRecommendation();
        }

        if(criterion.equalsIgnoreCase("SPIRITUALITY")){
            return new SpiritualityRecommendation();
        }

        return null;
    }
}
