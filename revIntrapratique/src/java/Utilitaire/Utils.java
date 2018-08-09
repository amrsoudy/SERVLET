package Utilitaire;

import java.util.HashMap;
import modele.Commande;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1795162
 */
public class Utils {

    HashMap<String, Integer> prix = new HashMap<String, Integer>();

    public Utils() {

    }

    public void creeLaListeDePrix() {
        prix.put("spiderman", 25);
        prix.put("transformer", 20);
        prix.put("Barbie", 20);
        prix.put("Chocoltae", 7);
        prix.put("vanille", 5);
        prix.put("liv", 10);

    }

    public Commande creeCommande(String nom, String prenom, String adress, String theme, String Glasage) {
        double prixTotal = 0;

      

            if (prix.containsKey(theme)) {
                prixTotal += prix.get(theme);
                System.out.println(prix.get(theme));

            }
            if (prix.containsKey(Glasage)) {

                prixTotal += prix.get(Glasage);
                System.out.println(prix.get(Glasage));

            }

       
        prixTotal += prix.get("liv");

        Commande c = new Commande(nom, prenom, adress, theme, Glasage, prixTotal);
        return c;

    }
    
    
}
