package com.chainsys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class student {

	    public static void main(String[] args) {
	        try {
	        	
	           
	            Connection myCon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Rpoo5397");
	            java.sql.Statement mystat = myCon.createStatement();
	            ResultSet myRs = mystat.executeQuery("select doctorname,department from hospital");
	            while (myRs.next()) {
	                System.out.println(myRs.getString("doctorname") + "\t " + myRs.getString("department"));
	               // System.out.println(myRs.getInt(1)+"\t"+myRs.getString(2));
	            }
	          //  ResultSet myRs1 = mystat.executeQuery("select * from hospital");
	       
	          //  while(myRs1.next())
	           // {
	            //	System.out.println(myRs1.getInt(1)+"\t"+myRs1.getString(2));
	          //  }
	            myCon.close();
	            mystat.close();
	        } catch (SQLException err) {
	            err.printStackTrace();
	        }
	    }
	}
