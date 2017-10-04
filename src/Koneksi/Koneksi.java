/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rothem
 */
public class Koneksi {
    
    public static Connection conn;
    
    public static Connection koneksiDatabase(){
        
        try{
            
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.3/DNetHouse","root","wisuda");
            //conn = DriverManager.getConnection("jdbc:odbc:DNetHouse");
            
            //JOptionPane.showMessageDialog(null,"Koneksi Berhasil");
            
        }catch(SQLException sqle){
            
            JOptionPane.showMessageDialog(null,""+sqle.getMessage());
            
        }catch(ClassNotFoundException cnfe){
            
            JOptionPane.showMessageDialog(null,""+cnfe.getMessage());
            
        }
        
        return conn;
        
    }
    
    public static void main(String[]args){
        
        Koneksi execute = new Koneksi();
        execute.koneksiDatabase();
        
    }
    
}
