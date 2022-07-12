package com.chainsys;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Database {
    public static void main(String[] args) {
        try {
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection myCon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
                    "Rpoo5397");
            PreparedStatement ps = myCon.prepareStatement("insert into schools values(?,?)");
            File f = new File("d:\\temp\\sample.txt");
            FileReader fr = new FileReader(f);
            int con =1;
            int count=0;
            java.util.Scanner sc=new java.util.Scanner(System.in);
            java.util.Scanner scan=new java.util.Scanner(System.in);
            while(con !=0) {
            	System.out.println("enter the id:");
            	int id=sc.nextInt();
            	System.out.println("enter the name:");
            	String name=scan.nextLine();
            ps.setInt(1, id);
            ps.setString(2, name);
            int j=ps.executeUpdate();
            count++;
            System.out.println("if you want to quit press 0");
            con=sc.nextInt();
            }

            System.out.println(count + " " + "record affected");
            myCon.close();
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
}