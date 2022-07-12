package com.chainsys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class practice {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Rpoo5397");
Statement smt=con.createStatement();
smt.executeUpdate("delete from schools where sno =103");
int result=smt.executeUpdate("insert into schools values(1,'nitish')");
System.out.println(result+"execute one row");
	}

}
