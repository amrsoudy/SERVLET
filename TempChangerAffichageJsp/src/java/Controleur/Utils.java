/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

/**
 *
 * @author 1795162
 */
public class Utils {

    static String convert(double x, String ver) {
        double conv;
        String s = "" ;
        if (ver.equals("Celsius")) {
            conv = x / 3.4;

            s = "<h1> " + x + " Fehrnhite ver  Celsius  est " + conv + "</h1>";

        } else if (ver.equals("Fehrnhite")) {
            conv = x * 3.4;
            s = "<h1> " + x + " Celsius ver  Fehrnhite  est " + conv + "</h1>";

        }
        return s ;

    }

  

}
