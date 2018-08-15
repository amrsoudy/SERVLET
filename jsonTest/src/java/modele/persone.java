/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.List;

/**
 *
 * @author 1795162
 */
public class persone {

    String nom;
    String prenom;
    String age;
    List<String> tel;

    public persone(String nom, String prenom, String age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = "Seoudy";
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = "Amr";
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = "30";
    }

    public List<String> getTel() {

        return tel;
    }

    public void setTel(List<String> tel) {
        tel.add("55555555");
        tel.add("999999999");
    }

}
