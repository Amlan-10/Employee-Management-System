//JDBC CONNECTIVITY-->1.Register the Driver class
//2.Creating the connection String 3.Creating statement 4.Executing Mysql queries  5.Closing the connections
package employee.management.system;
import java.sql.*;
public class Conn {

    Connection c;
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//Register the Driver class
            c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem","root","Kvpc@1964");//Creating the connection String
            s = c.createStatement();//Creating statement
        }catch (Exception e){
            e.printStackTrace();
        }
    }    
}
