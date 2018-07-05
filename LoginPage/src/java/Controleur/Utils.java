/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1795162
 */
public class Utils {

    static int addUser(String _username, String _password, String _age, String _email) {

        int x = 0;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/DBAmr", "amr", "Secret");
            String Query = "INSERT INTO USERS VALUES (?,?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(Query);
            pstm.setString(1, _username);
            pstm.setString(2, _password);
            pstm.setString(3, _age);
            pstm.setString(4, _email);

            x = pstm.executeUpdate();
            pstm.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }

    static int addProduct(String _nameProduct, double _price, String _ImgPath) {

        int x = 0;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/DBAmr", "amr", "Secret");
            String Query = "INSERT INTO PRODUCTS VALUES (?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(Query);
            pstm.setString(1, _nameProduct);
            pstm.setDouble(2, _price);
            pstm.setString(3, _ImgPath);

            x = pstm.executeUpdate();
            pstm.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }

    static ArrayList<Product> RemplierTableaudeProduit() {
        //remblier le taleau avec tous les produite de BDD et return array avec ca 
        ArrayList<Product> ar = new ArrayList<Product>();

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/DBAmr", "amr", "Secret");
            System.out.println("Connected ");
            String Query = "select * from PRODUCTS ";
            PreparedStatement psm = conn.prepareStatement(Query);

            ResultSet rs = psm.executeQuery();
           
            while (rs.next()) {

               Product product = new Product(rs.getString("PRODUCTNAME"), rs.getDouble("PRICE"), rs.getString("IMGPATH"));
                ar.add(product);

            }
            
            rs.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ar;
    }

}
