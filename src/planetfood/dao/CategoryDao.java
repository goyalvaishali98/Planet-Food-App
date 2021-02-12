
package planetfood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import planetfood.dbutil.DBConnection;
import planetfood.pojo.Category;

public class CategoryDao {
    public static HashMap<String,String> getAllCategoryId()throws SQLException{
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select cat_name,cat_id from categories");
        HashMap<String,String> categories = new HashMap<>();
        while(rs.next()){
            String catName = rs.getString(1);
            String catId=rs.getString(2);
            categories.put(catName,catId);
        }
        return categories;
    }
    
    public static HashMap<String,String>getAllCatId()throws SQLException{
         Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select cat_id,cat_name from categories");
        HashMap<String,String> categories = new HashMap<>();
        while(rs.next()){
            String catId = rs.getString(1);
            String catName=rs.getString(2);
            categories.put(catId,catName);
        }
        return categories;
    }
    public static boolean addCategory(Category c)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Insert into categories values(?,?)");
        ps.setString(1, c.getCatId());
        ps.setString(2, c.getCatName());
        int x = ps.executeUpdate();
        return (x>0);
    }
    public static String getNewCatID()throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select count(*) from categories");
        int id = 101;
        ResultSet rs = ps.executeQuery();
        if(rs.next())
            id = id+rs.getInt(1);
        return "C"+id;
    }
    public static ArrayList<Category> getAllData()throws SQLException{
        Connection conn = DBConnection.getConnection();
        String qry = "Select * from categories";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(qry);
        ArrayList<Category> categoryList = new ArrayList<Category>();
        while(rs.next()){
            Category c = new Category();
            c.setCatId(rs.getString("cat_id"));
            c.setCatName(rs.getString("cat_name"));
            categoryList.add(c);
        }
        return categoryList;
    }
    public static boolean updateCategory(Category c)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Update Categories set cat_name=? where cat_id=?");
        ps.setString(1,c.getCatName());
        ps.setString(2,c.getCatId());
        int x = ps.executeUpdate();
        return (x>0);
    }
}
