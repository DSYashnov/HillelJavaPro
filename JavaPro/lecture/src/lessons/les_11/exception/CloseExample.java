package lessons.les_11.exception;

import java.sql.SQLException;

public class CloseExample {
    public static void main(String[] args) throws SQLException {
        try (Test text = new Test();){
            text.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
