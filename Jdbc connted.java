*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcconnect;
import java.sql.*;
/**
 *
 * @author shreya purohit 
 */
public class Jdbcconnect {

    public static void main(String[] args) {
        // TODO code application logic here
        String url = "jdbc:mysql://localhost:3306/company";
        String user = "root";
        String pass = "soodraghav10";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
         
          Connection conn = DriverManager.getConnection(url,user,pass);
       /*   
        PreparedStatement ps = conn.prepareStatement("insert into data value(?,?,?)");
          
          ps.setInt(1, 101);
          ps.setString(2,"Life");
          ps.setInt(3, 20);
          ps.executeUpdate();*/
          
          Statement st = conn.createStatement();
          ResultSet rs = st.executeQuery("select * from data");
          while(rs.next())
          {
              System.out.print(rs.getString(1)+" ");
               System.out.print(rs.getString(2)+" ");
                System.out.println(rs.getString(3)+" ");
          }  
          System.out.println("Done insert");
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
DataBase Name = company;
table name = data;
