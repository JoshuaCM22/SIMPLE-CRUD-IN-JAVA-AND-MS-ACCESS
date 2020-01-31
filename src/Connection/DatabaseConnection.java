package Connection;

import java.io.File;
import java.sql.*;
import java.sql.DriverManager;

public class DatabaseConnection {

    private Connection con;
    private static DatabaseConnection dbc;

    private DatabaseConnection() {

        try {

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            System.out.println("INITIALIZATION");
            File filePathLocation = new File("STUDENTS.accdb");
            con = DriverManager.getConnection("jdbc:ucanaccess://" + filePathLocation);
            System.out.println("SUCCESSFULLY CONNECTED");

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    public static DatabaseConnection getDatabaseConnection() {
        if (dbc == null) {
            dbc = new DatabaseConnection();
        }
        return dbc;
    }

    public Connection getConnection() {
        return con;
    }
}
