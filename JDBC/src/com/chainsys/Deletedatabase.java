package com.chainsys;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Deletedatabase {
    public static void main(String[] args) {
        try {
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection myCon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
                    "Rpoo5397");   
            PreparedStatement ps = myCon.prepareStatement("delete from schools where sno=?");
            File f = new File("d:\\temp\\sample.txt");
            FileReader fr = new FileReader(f);
           
            
          //  ps.setString(1, "poobalan");
            ps.setInt(1, 102);
            int i = ps.executeUpdate();
           // ps.setInt(1, 103);
           // ps.setCharacterStream(2, fr,(int)f.length());
          
           //int j = ps.executeUpdate();
          //int total=i+j;
            System.out.println(i + " " + "record affected");
            myCon.close();
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
}