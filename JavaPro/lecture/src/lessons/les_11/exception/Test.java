package lessons.les_11.exception;

import java.io.Closeable;
import java.io.IOException;
import java.sql.SQLException;

public class Test implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("run method : close()");
    }
    public void run () throws SQLException {
        System.out.println("run method : run");
        throw new SQLException("class run");
    }

}
