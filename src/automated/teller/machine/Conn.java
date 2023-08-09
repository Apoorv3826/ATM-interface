
package automated.teller.machine;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class Conn {
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            //Class.forName("com.mysql.jdbc.Driver");  
            c = DriverManager.getConnection("jdbc:mysql:///automatedtellermachine","root","apoorv");    
            s = c.createStatement();
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
}
}