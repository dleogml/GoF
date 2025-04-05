package org.example.section2.bridge;

import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.h2.driver");

        try(Connection conn = DriverManager.getConnection("jdbc:h2:mem:~/test", "sa", "")) {
            String sql = "CREATE TABLE ACCOUNT " +
                    "(id INTEGER not NULL, " +
                    "email VARCHAR(255), " +
                    "password VARCHAR(255), " +
                    "PRIMARY KEY(id))";

            Statement statement = conn.createStatement();
            statement.execute(sql);

//            PreparedStatement statement1 = conn.prepareStatement(sql);
//            ResultSet resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
