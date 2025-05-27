package service;

import dto.Student;

import java.sql.SQLException;
import java.util.List;

public interface DBService {
    List<String> getGroupList() throws SQLException;

    List<Student> getGroupLisByGroup(String groupNumber) throws SQLException;

    void createStudent(Student student) throws SQLException;

    void deleteStudent(int id) throws SQLException;
}
