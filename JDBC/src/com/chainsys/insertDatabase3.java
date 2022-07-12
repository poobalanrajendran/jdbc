package com.chainsys;

import java.sql.*;
import java.io.*;

public class insertDatabase3{

    public static void main(String args[]) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Rpoo5397");

        PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?,?)");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("enter id:");
            int emp_id = Integer.parseInt(br.readLine());
            System.out.println("enter name:");
            String ename = br.readLine();
            System.out.println("enter salary:");
            float salary = Float.parseFloat(br.readLine());
            System.out.println("enter city");
            String city=br.readLine();

            ps.setInt(1, emp_id);
            ps.setString(2, ename);
            ps.setFloat(3, salary);
            ps.setString(4, city);
            int i = ps.executeUpdate();
            System.out.println(i + " records affected");

            System.out.println("Do you want to continue: y/n");
            String s = br.readLine();
            if (s.startsWith("n")) {
                break;
            }
        } while (true);

        con.close();
    }
}
