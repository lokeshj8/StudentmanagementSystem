import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public void insertStudent(Student s) throws SQLException {
        String sql = "INSERT INTO students (id, name, age, course) VALUES (?, ?, ?, ?)";
        try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setInt(3, s.getAge());
            ps.setString(4, s.getCourse());
            ps.executeUpdate();
            System.out.println("✅ Student Added.");
        }
    }

    public List<Student> getAllStudents() throws SQLException {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try (Connection con = DBConnection.getConnection(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Student s = new Student(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getString("course"));
                list.add(s);
            }
        }
        return list;
    }
}
