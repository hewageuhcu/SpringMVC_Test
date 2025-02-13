package com.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtil {

    private static final String URL = "jdbc:oracle:thin:@//localhost:1521/xe";
    private static final String USERNAME = "SYS as SYSDBA";
    private static final String PASSWORD = "HPLanka22881";

    // Method to establish connection and query data
    public static void getEmployeeData() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Register JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Open a connection
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            // Execute a query
            stmt = conn.createStatement();
            String sql = "SELECT EMP_ID, FIRST_NAME, LAST_NAME, EMAIL, SALARY FROM EmployyeeTestDB.EMPLOYEE";
            rs = stmt.executeQuery(sql);

            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                int EMP_ID = rs.getInt("EMP_ID");
                String FIRST_NAME = rs.getString("FIRST_NAME");
                String LAST_NAME = rs.getString("LAST_NAME");
              String EMAIL = rs.getString("EMAIL");
                int SALARY = rs.getInt("SALARY");

                // Display the values
                System.out.println("EMPID: " + EMP_ID + ", First Name: " + FIRST_NAME +
                        ", Last Name: " + LAST_NAME + ",Email: " + EMAIL +
                        ", Salary: " + SALARY);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Clean up environment
            try { if (rs != null) rs.close(); } catch (Exception e) {System.out.println(e.getMessage()); }
            try { if (stmt != null) stmt.close(); } catch (Exception e) { System.out.println(e.getMessage());}
            try { if (conn != null) conn.close(); } catch (Exception e) { System.out.println(e.getMessage());}
        }
    }
}
