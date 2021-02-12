
package planetfood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import planetfood.dbutil.DBConnection;
import planetfood.pojo.User;

public class UserDao {
    public static String validateUser(User user)throws SQLException{
        Connection conn=DBConnection.getConnection();
        String qry = "Select username from Users where userid=? and password=? and usertype=?";
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1, user.getUserId());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getUserType());
        ResultSet rs = ps.executeQuery();
        String username = null;
        if(rs.next()){
            username = rs.getString(1);         //1 for column username
        }
        return username;
    }
}
