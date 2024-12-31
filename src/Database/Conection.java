package Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ivana
 */
public class Conection {
    
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Rental_mobil", "root","");
                System.out.println("Driver ditemukan");
            } catch (SQLException ex) {
                System.out.println("Error koneksi");
            }
        }
        return connection;
    }
}
