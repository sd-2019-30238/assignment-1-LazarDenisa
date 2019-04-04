package businessLogic;

import dataAccessLayer.BookDAO;

import java.sql.SQLException;

public class RecommendationByAuthor implements Recommendation {
    public String getRecommendation(String author) {
        BookDAO bDAO = new BookDAO();
        try{
            return bDAO.filterByAuthor(author);
        }catch(SQLException e){
            e.printStackTrace();
        }

        return null;

    }
}
