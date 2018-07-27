/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author 1795162
 */
public class    Info {

    private  String prenom;
    private  String nom;
    private  int revenu;
    private  int montantPret;

    public Info(String nom,String prenom, int x, int y) {
        
        this.prenom = prenom;
        this.nom = nom ;
        this.revenu =x ;
        this.montantPret = y;
        
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getRevenu() {
        return revenu;
    }

    public void setRevenu(int revenu) {
        this.revenu = revenu;
    }

    public int getMontantPret() {
        return montantPret;
    }

    public void setMontantPret(int montantPret) {
        this.montantPret = montantPret;
    }

    @Override
    public String toString() {
        return "Info{" + "prenom=" + prenom + ", nom=" + nom + ", x=" + revenu + ", y=" + montantPret + '}';
    }
    
    
    
}
