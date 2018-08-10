/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author 1795162
 */
public class Commande {
    String nom ;
    String prenom ;
    String adress;
    String theme ;
    String glasage;
    double prixTotal ;

    public Commande(String nom, String prenom, String adress, String theme, String Glasage, double prixTotal) {
        this.nom=nom ;
        this.prenom=prenom;
        this.adress=adress;
        this.theme = theme ;
        this.glasage =Glasage ;
        this.prixTotal = prixTotal;
        
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getGlasage() {
        return glasage;
    }

    public void setGlasage(String glasage) {
        this.glasage = glasage;
    }

    public double getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(double prixTotal) {
        this.prixTotal = prixTotal;
    }
   
    
    
}
