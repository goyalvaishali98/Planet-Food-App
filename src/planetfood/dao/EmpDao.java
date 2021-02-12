
package planetfood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import planetfood.dbutil.DBConnection;
import planetfood.pojo.Employee;

public class EmpDao {
     public static String getNewEmpID()throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select count(*) from employees");
        int id = 101;
        ResultSet rs = ps.executeQuery();
        if(rs.next())
            id = id+rs.getInt(1);
        return "E"+id;
    }
     public static boolean addEmployee(Employee e)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Insert into employees values(?,?,?,?)");
        ps.setString(1, e.getEmpId());
        ps.setString(2, e.getEmpName());
        ps.setString(3, e.getJob());
        ps.setDouble(4, e.getSalary());
        int x = ps.executeUpdate();
        return (x>0);
    }
    public static ArrayList<String> getAllEmployeeId()throws SQLException{
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select empid from employees");
        ArrayList<String> employees = new ArrayList<>();
        while(rs.next()){
            String empId = rs.getString(1);
            employees.add(empId);
        }
        return employees;
    }
    public static HashMap<String,Employee> getEmployeesByEmpId(String empId)throws SQLException{
        Connection conn = DBConnection.getConnection();
        String qry = "Select * from employees where empid=?";
        PreparedStatement ps = conn.prepareStatement(qry);
        HashMap<String,Employee> employeeList = new HashMap<>();
        ps.setString(1,empId);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Employee e = new Employee();
            e.setEmpId(empId);
            e.setEmpName(rs.getString("ename"));
            e.setJob(rs.getString("job"));
            e.setSalary(rs.getDouble("sal"));
            employeeList.put(e.getEmpId(),e);
        }
        return employeeList;
    }
      public static ArrayList<Employee> getAllData()throws SQLException{
        Connection conn = DBConnection.getConnection();
        String qry = "Select * from employees";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(qry);
        ArrayList<Employee> employeeList = new ArrayList<>();
        while(rs.next()){
            Employee e = new Employee();
            e.setEmpId(rs.getString("empid"));
            e.setEmpName(rs.getString("ename"));
            e.setJob(rs.getString("job"));
            e.setSalary(rs.getDouble("sal"));
            employeeList.add(e);
        }
        return employeeList;
    }
     public static boolean updateEmployee(Employee e)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Update employees set ename=?,job=?,sal=? where empid=?");
        ps.setString(1,e.getEmpName());
        ps.setString(2,e.getJob());
        ps.setDouble(3,e.getSalary());
        ps.setString(4,e.getEmpId());
        int x = ps.executeUpdate();
        return (x>0);
    }
    public static boolean removeEmployee(String empId)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update employees set ename=Null,job=Null,sal=Null where empid=?");
        ps.setString(1,empId);
        int x = ps.executeUpdate();
        return x>0;        
    }
}
