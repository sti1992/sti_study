
import java.sql.*;

/**
 * @version 1.0
 * @Author sti
 * @Date 2022/04/03 21:56
 */
public class StiJdbc {

    public static void main(String[] args) throws SQLException {
        StiJdbc sj = new StiJdbc();
        sj.jdbc1();
        sj.jdbc2();
    }
    public void jdbc1() throws SQLException {
        Connection conn =null;
        try {
            Class.forName("com.mysql.jdbc.Driver") ;
            String url = "jdbc:mysql://localhost:3306/test";
            String username = "root";
            String password = "root";
             conn = DriverManager.getConnection(url, username, password);
            //开启事务
             conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select current_date as current_date1 ");
            //提交事务
            conn.commit();
            while (rs.next()){
                System.out.println(rs.getString("current_date1"));
            }
        }catch (Exception e){
            conn.rollback();
        }
    }
    public void jdbc2(){
        try {
            Class.forName("com.mysql.jdbc.Driver") ;
            String url = "jdbc:mysql://localhost:3306/test";
            String username = "root";
            String password = "root";
            Connection conn = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = conn.prepareStatement("");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString(""));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
