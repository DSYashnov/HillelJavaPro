package service;

import java.sql.SQLException;
import java.util.List;

public interface DBService {
    List<String> getGroupList() throws SQLException;
}
