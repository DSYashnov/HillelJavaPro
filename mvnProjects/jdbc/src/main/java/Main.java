import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static final String serverTimeZone = "UTC";
    public static final String serverName = "localhost"; //ip address
    public static final String databaseName = "hillel"; //bd name
    public static final int portNumber = 3306;
    public static final String user = "root"; //login
    public static final String password = "rootroot"; //password

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //create DB
        //create connectivity to DB ([java app -> jdbc] -> DB)
        //jdbc url + login + pass

        //statement and prepared statement

        //MySQL DB connectivity configuration
        MysqlDataSource dataSource = new MysqlDataSource();

        dataSource.setUseSSL(false);
        dataSource.setServerTimezone(serverTimeZone);
        dataSource.setServerName(serverName);
        dataSource.setDatabaseName(databaseName);
        dataSource.setPortNumber(portNumber);
        dataSource.setUser(user);
        dataSource.setPassword(password);

        //create connection to DB
        Connection connection = dataSource.getConnection();

        String SQL = """
                create table if not exists hillel.empl(
                first_name varchar(255) not null,
                last_name varchar(255) not null
                );""";

        //create table using SQL query
        Statement statement = connection.createStatement();
        statement.execute(SQL);

        //add user Ivan Ivanov
        statement.execute("insert into empl (first_name, last_name) value ('Ivan', 'Ivanov')");

    }
}
