package config;

import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.cj.MysqlConnection;
import com.mysql.cj.jdbc.MysqlDataSource;


public class DBConnectivity {

    private static Connection connection;
    private static String serverTimeZone = "UTC";
    private static String serverName = "localhost";
    private static String databaseName = "hillel";
    private static int databasePort = 3306;
    private static String user = "root";
    private static String password = "rootroot";

    public static Connection getConnection() throws SQLException {

        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUseSSL(false);
        dataSource.setServerTimezone(serverTimeZone);
        dataSource.setServerName(serverName);
        dataSource.setDatabaseName(databaseName);
        dataSource.setPortNumber(databasePort);
        dataSource.setUser(user);
        dataSource.setPassword(password);

        return connection = dataSource.getConnection();
    }
    public static void closeConnection() throws SQLException {
        connection.close();
    }
}
