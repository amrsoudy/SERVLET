/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author 1795162
 */
public class produit {
    private String description ;
    private int quantite;
    private double  pricunitaire;

    public produit(String description, int quantite, double pricunitaire) {
        super();
        this.description = description;
        this.quantite = quantite;
        this.pricunitaire = pricunitaire;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPricunitaire() {
        return pricunitaire;
    }

    public void setPricunitaire(int pricunitaire) {
        this.pricunitaire = pricunitaire;
    }
    
    
}
