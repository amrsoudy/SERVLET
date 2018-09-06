/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author 1795162
 */
public class Persone {
    
    int nomber ;
    double poid ;
    int semain ;

    public Persone(int nomber, double poid, int semain) {
        this.nomber = nomber;
        this.poid = poid;
        this.semain = semain;
    }

    
    
    public int getNomber() {
        return nomber;
    }

    public void setNomber(int nomber) {
        this.nomber = nomber;
    }

    public double getPoid() {
        return poid;
    }

    public void setPoid(double poid) {
        this.poid = poid;
    }

    public int getSemain() {
        return semain;
    }

    public void setSemain(int semain) {
        this.semain = semain;
    }

    @Override
    public String toString() {
        return "Persone{" + "nomber=" + nomber + ", poid=" + poid + ", semain=" + semain + '}';
    }
    
    
}
