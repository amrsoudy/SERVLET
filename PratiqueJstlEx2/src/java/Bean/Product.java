/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author 1795162
 */
public class Product {
    private String nom;
    private double prix;
    private String photo;

    public Product(String nom, double prix, String photo) {
        
        this.nom = nom;
        this.prix = prix;
        this.photo = photo ;
             
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Product{" + "nom=" + nom + ", prix=" + prix + ", photo=" + photo + '}';
    }
    
}
