package com.bootcamp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentHelper {
  private final String dbUrl;
  private final String username;
  private final String password;

  private String name;
  private String email;

  public StudentHelper(Database databaseType, String database, String username, String password) {
    this.dbUrl = "jdbc:mysql://localhost:3306/" + database;
    this.username = username;
    this.password = password;
  }

  // getter

  public int insert(String name, String email) throws SQLException {
    Connection conn = DriverManager.getConnection(this.dbUrl, this.username, this.password);
    try {
      String sql = "INSERT INTO students (name, email) VALUES (?, ?)";
      PreparedStatement stmt = conn.prepareStatement(sql);
      stmt.setString(1, name);
      stmt.setString(2, email);
      int rows = stmt.executeUpdate();
      System.out.println("Inserted: " + rows);
      return rows;
    } catch (Exception e) {
      e.printStackTrace();
      return -1;
    }
  }
}