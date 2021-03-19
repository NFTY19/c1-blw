package task1_jdbc2345;

import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    @Test
    public void test2() {
        Connection conn = null;
        ResultSet rs = null;
        Stu s = null;
        List<Stu> list = new ArrayList<>();
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from homework.stu";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                s = new Stu();
                s.setSno(rs.getString(1));
                s.setName(rs.getString(2));
                s.setAge(rs.getInt(3));
                s.setCollege(rs.getString(4));

                list.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(list);
    }


}
