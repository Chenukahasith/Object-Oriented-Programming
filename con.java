import java.sql.*;

public class con {
    public static void main(String[] args) {
        try {
            Class.forName("Com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/";
            String username = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url,username,password);

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from user");
            while (rs.next()) {
                System.out.println("id: " + rs.getInt("id"));
                System.out.println("name: " + rs.getString("name"));
                System.out.println("email: " + rs.getString("email"));
                System.out.println("phone: " + rs.getString("phone"));
                System.out.println("address: " + rs.getString("address"));
                System.out.println("city: " + rs.getString("city"));
                System.out.println("state: " + rs.getString("state"));
                System.out.println("country: " + rs.getString("country"));

            }
            rs.close();
            stmt.close();
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
        } catch (SQLException e)  {
            System.out.println("SQLException");
        }
    }
}