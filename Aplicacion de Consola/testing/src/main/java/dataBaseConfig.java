/*Created by IntelliJ IDEA.
        User: yan
        Date: 13/1/2018
        Time: 9:53 PM
*/
import java.sql.Connection;
import java.sql.DriverManager;

public class dataBaseConfig {

    public static Connection getConnection() {
        Connection connection = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            //SSL desactivado y autoReconectar activado
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing?autoReconnect=true&useSSL=false", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;


    }
}
