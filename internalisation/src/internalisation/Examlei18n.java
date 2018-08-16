/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalisation;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 *
 * @author 1795162
 */
public class Examlei18n {

    static public void main(String[] args) {
        String language = "" ;
        String country="";
        String choix="";
        Locale currentLocal;
        ResourceBundle messages;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quelle langue (fr pour francais et allemand)");
        choix = sc.next();
        if(choix.equals(("fr"))){
        
        language = "fr";
        country = "CA";
        
        
        }else if(choix.equals("al")){
        language ="de";
        country ="DE";
                
        
        }
        currentLocal = new Locale(language,country);
        System.out.println(currentLocal);

        messages = ResourceBundle.getBundle("internalisation/MessagesBundle",currentLocal);
        
        System.out.println(messages.getString("greetings"));
        System.out.println(messages.getString("inquiry"));
        System.out.println(messages.getString("farwell"));

    }

}
