import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectioHelper {

    public static Connection getConnection() {
        Connection con = null;
        try {
            con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employeedbjdbc","root","root");
            System.out.println("successfully connection build");


        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}


