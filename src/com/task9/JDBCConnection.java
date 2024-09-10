package com.task9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCConnection {
    static final String DB_URL = "jdbc:mysql://localhost:3306/sys";
    static final String USER = "root";
    static final String PASS = "Saro@8997";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to the database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            String sql = "INSERT INTO Employee (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);

            insertEmployee(pstmt, 101, "Jenny", 25, 10000);
            insertEmployee(pstmt, 102, "Jacky", 30, 20000);
            insertEmployee(pstmt, 103, "Joe", 20, 40000);
            insertEmployee(pstmt, 104, "John", 40, 80000);
            insertEmployee(pstmt, 105, "Shameer", 25, 90000);

            System.out.println("Records inserted successfully.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    private static void insertEmployee(PreparedStatement pstmt, int empcode, String empname, int empage, double esalary) throws SQLException {
        pstmt.setInt(1, empcode);
        pstmt.setString(2, empname);
        pstmt.setInt(3, empage);
        pstmt.setDouble(4, esalary);
        pstmt.executeUpdate();
    }
}
