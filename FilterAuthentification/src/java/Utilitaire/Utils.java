/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitaire;

import modele.ListClient;
import modele.Persone;

/**
 *
 * @author 1795162
 */
public class Utils {

    private static Utils util;

    public static Utils GetInstance() {

        if (util == null) {

            util = new Utils();
            return util;
        } else {

            return util;
        }

    }

    public boolean validateForLoging(String username, String pass, String Email) {
        boolean x = false;

        x = isExistForLoging(username, pass, Email);

        return x;
    }

    private boolean isExistForLoging(String username, String pass, String Email) {
        boolean x = false;
        for (Persone p : ListClient.getInstance()) {

            if (username.toLowerCase().equals(p.getUserName()) && pass.equals(p.getPass()) && Email.toLowerCase().equals(p.getEmail())) {

                x = true;

            } else {

                x = false;
            }

        }
        return x;
    }

    private boolean isExistForAdding(String username, String Email) {
        boolean x = false;
        for (Persone p : ListClient.getInstance()) {

            if (username.toLowerCase().equals(p.getUserName()) && Email.toLowerCase().equals(p.getEmail())) {

                x = true;

            } else {

                x = false;
            }

        }
        return x;
    }

    public boolean validateBeforeAdding(String username, String pass, String Email) {

        boolean exist = false;
        boolean res = false;

        exist = isExistForAdding(username, Email);
        //if available in the database and  username or Email
        if (exist) {
            res = true;

        } else {

            res = false;
        }

        return res;
    }

    public boolean valideEcriteur(String username, String pass, String Email) {
        boolean valid = false;
        System.out.println(username);
        System.out.println(pass);
        
        // to delete any spaces in the username 
        

        if (!"".equals(username) && username != null && !pass.equals(null) && !pass.equals("") && !Email.equals(null) && !Email.equals("")) {

            valid = true;

        } else {
            valid = false;
        }

        return valid;

    }

}
