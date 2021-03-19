package task1_jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * CREATE TABLE stu(
 * 	SNO VARCHAR(20),
 * 	NAME VARCHAR(10),
 * 	Age INT,
 * 	College VARCHAR(30)
 * );
 *
 * 1.插入如下数据
 * ('s001','老大',20,'计算机学院')
 * ('s002','老二',19,'计算机学院')
 * ('s003','老三',18,'计算机学院')
 * ('s004','老四',17,'计算机学院')
 */
public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtils.getConnection();
            String sql = "insert into stu(SNO, Name, Age, College) values " +
                    "('s001','老大',20,'计算机学院')," +
                    "('s002','老二',19,'计算机学院')," +
                    "('s003','老三',18,'计算机学院')," +
                    "('s004','老四',17,'计算机学院')";

            pstmt = conn.prepareStatement(sql);

            int counts = pstmt.executeUpdate();
            System.out.println(counts);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(rs,pstmt,conn);
        }
    }
}
