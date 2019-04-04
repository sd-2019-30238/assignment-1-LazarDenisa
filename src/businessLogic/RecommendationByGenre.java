package businessLogic;

import dataAccessLayer.BookDAO;

import java.sql.SQLException;

public class RecommendationByGenre implements Recommendation {
    public String getRecommendation(String genre) {
        BookDAO bDAO = new BookDAO();
        try{
            return bDAO.filterByGenre(genre);
        }catch(SQLException e){
            e.printStackTrace();
        }

        return null;

    }
}
