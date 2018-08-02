/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Beans.Hotel;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1795162
 */
public class  DataManager {
    
    public  static  Connection getConnection() {
        
        String url = "jdbc:derby://localhost:1527/DBAmr";
        String user = "amr";
        String pwd = "Secret";
        
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(url, user, pwd);
            System.out.println("connected ");
            
        } catch (SQLException ex) {
            System.out.println("connection impossible");
            ex.printStackTrace();
        }
        
        return conn;
        
    }
    
    public static void putConnection(Connection conn) {
        
        if (conn != null) {
            
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println("incapable de fermer la connection ");
                ex.printStackTrace();
                
            }
            
        }
        
    }
    
    public static ArrayList getListHotels() {
        
        ArrayList listHotels = new ArrayList();
        Connection conn = getConnection();
        
        if (conn != null) {
            
            ResultSet rs = null;
            Statement statement = null;
            
            try {
                String strQuery = "select HOTELNO,HOTELNAME,CITY FROM hotel";
                
                statement = conn.createStatement();
                rs = statement.executeQuery(strQuery);
                Hotel hotel;
                while (rs.next()) {
                    
                    hotel = new Hotel();
                    hotel.setHotelId(rs.getString("HOTELNO"));
                    hotel.setNom(rs.getString("HOTELNAME"));
                    hotel.setVille(rs.getString("CITY"));
                    listHotels.add(hotel);
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                
                try {
                    rs.close();
                    statement.close();
                    
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    putConnection(conn);
                }
                
            }
            
        }
        
        return listHotels;
        
    }
    
    public static Hotel getDetailsHotel(String idHotel) {
        
        String strQuery = "";
        Hotel hotel = new Hotel();
        Connection conn = getConnection();
        
        if (conn != null) {
            ResultSet rs = null;
            Statement statement = null;
            
            try {
                strQuery = "select HOTELNO,HOTELNAME,CITY,STARS FROM hotel where HOTELNO =\'" + idHotel + "\'";
                
                statement = conn.createStatement();
                rs = statement.executeQuery(strQuery);
                
                if (rs.next()) {
                    hotel.setHotelId(rs.getString("HOTELNO"));
                    hotel.setNom(rs.getString("HOTELNAME"));
                    hotel.setVille(rs.getString("CITY"));
                    hotel.setStars(rs.getString("STARS"));
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                
                try {
                    rs.close();
                    statement.close();
                } catch (SQLException ex) {
ex.printStackTrace();
                    putConnection(conn);                }
            }
            
        }
        
        return hotel;
    }
    
}
