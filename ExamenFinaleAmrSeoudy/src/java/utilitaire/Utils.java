/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitaire;

import java.util.ArrayList;
import modele.ListPersones;
import modele.Persone;
import org.apache.jasper.tagplugins.jstl.ForEach;

/**
 *
 * @author 1795162
 */
public class Utils {

    private static Utils utils;

    public static Utils getInstance() {

        if (utils == null) {

            utils = new Utils();
            return utils;
        } else {

            return utils;

        }

    }

    public String souvgarder(int number, double poids, int semaine) {

        Persone p = new Persone(number, poids, semaine);
        ListPersones.getInstance().add(p);

        String msg = checkStatus(number, semaine, poids);
        return msg;

    }

    private String checkStatus(int number, int semaine, double poids) {

        double total = 0;
        double poidSemainDerrnier = 0;
        double res = 0;
        String msg = "";

        for (Persone p : ListPersones.getInstance()) {

            if (p.getNomber() == number) {

                total += p.getPoid();
                if (p.getSemain() == semaine - 1) {
                    poidSemainDerrnier = p.getPoid();
                    res = poids - poidSemainDerrnier;

                }
            }

        }

        if (res == 0 && semaine == 1) {

            msg = "Ca la primerir fois donc on va compare ala prochiane ";

        } else if (res == 0 && semaine != 1) {
            msg = "tu ne perde pas le poids  donc tu vas pas payer ";

        } else if (res > 0) {
            msg = "tu augmenter avec  " + res + " KG   donc tu vas  payer ton pénalité  " + res * 5 + "  $";

        } else if (res < 0) {

            msg = "tu perdu " + (res * -1) + "  KG le poids felicitation  ";

        }

        return msg;
    }
  ArrayList<Persone> ar = new ArrayList<>();
    public ArrayList<Persone> getPersoneList(int number) {
      

        for (Persone p : ListPersones.getInstance()) {
           
            if (p.getNomber() == number) {

                ar.add(p);
            }
        }

        return ar;

    }

}
