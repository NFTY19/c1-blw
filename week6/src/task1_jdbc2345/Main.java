package task1_jdbc2345;

import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    @Test
    public void test2() {
        Connection conn = null;
        ResultSet rs = null;
        Stu s = null;
        PreparedStatement pstmt = null;
        List<Stu> list = new ArrayList<>();
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from homework.stu";
            pstmt = conn.prepareStatement(sql);
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
        } finally {
            JDBCUtils.close(rs, pstmt, conn);
        }
        System.out.println(list);
    }

    @Test
    public void test3() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "delete from homework.stu where sno = 's004'";
            pstmt = conn.prepareStatement(sql);
            int counts = pstmt.executeUpdate();
            System.out.println(counts);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null,pstmt, conn);
        }
    }

    @Test
    public void test4() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Stu> list = new LinkedList<>();
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from homework.stu where sno = 's003'";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            Stu s;
            while (rs.next()) {
                s = new Stu();
                s.setSno(rs.getString(1));
                s.setName(rs.getString(2));
                s.setAge(rs.getInt(3));
                s.setCollege(rs.getString(4));

                list.add(s);
            }

            System.out.println(list);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(rs, pstmt, conn);
        }
    }

    @Test
    public void test5() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "update homework.stu set college = '通信学院' where sno = 's001'";
            pstmt = conn.prepareStatement(sql);

            int counts = pstmt.executeUpdate();
            System.out.println(counts);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null, pstmt, conn);
        }
    }
}
