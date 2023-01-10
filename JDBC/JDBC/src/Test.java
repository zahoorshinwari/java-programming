import java.sql.*;
public class Test {

    
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException cnf)
        {
            System.out.println("sorry the required class was not found");
        }
        
        String db = "d:/5th semister/Advance Programming Section B/JDBC/Database1.accdb";
        String url = "jdbc:ucanaccess://" + db;
        try
        {
        con = DriverManager.getConnection(url);
        st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM Table1");
        System.out.println("Student_Number \t Student_Name \t\t Student_Address");
        while(rs.next())
        {
            //System.out.println(rs.getInt("Student_Number")+ " \t\t " + rs.getString("Student_Name") + " \t\t " + rs.getString("Student_Address") );
            System.out.println(rs.getInt(1)+ " \t\t " + rs.getString(2) + " \t\t " + rs.getString(3) );
        }
        }
        catch(SQLException sqE)
                {
                   System.out.println(sqE);
                }
    
    finally
        {
        try
        {
            if(con != null)
            con.close();
        }
        catch(Exception sqE)
        {
            System.out.println(sqE);
            }
        }
    }
}