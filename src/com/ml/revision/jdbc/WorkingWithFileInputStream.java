package com.ml.revision.jdbc;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class WorkingWithFileInputStream {

    public static void main(String[] args) throws Exception {
	
	      //Registering the Driver
	      DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	      //Getting the connection
	      String mysqlUrl = "jdbc:mysql://localhost/test2";
	      Connection con = DriverManager.getConnection(mysqlUrl, "root", "68921794");
	      System.out.println("Connection established......");
	      PreparedStatement pstmt = con.prepareStatement("INSERT INTO images VALUES(?,?,?)");
	      pstmt.setInt(1, 1001);
	      pstmt.setString(2, "JTC Logo");
	      //Inserting Blob type
	      InputStream in = new FileInputStream("E:\\Java Full Stack\\JTC India\\Core Java\\Lang Package\\123.jpg");
	      pstmt.setBlob(3, in);
	      //Executing the statement
	      pstmt.execute();
	      System.out.println("Record inserted......");
	   }

}
