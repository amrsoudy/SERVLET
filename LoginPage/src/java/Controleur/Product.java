/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

/**
 *
 * @author AMR
 */
public class Product {
    
    String name ;
    double Price ;
    String Img ;

    public Product(String name, double Price, String Img) {
        this.name = name;
        this.Price = Price;
        this.Img = Img;
    }
    
    

    public String getImg() {
        return Img;
    }

    public void setImg(String Img) {
        this.Img = Img;
    }
    

    
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", Price=" + Price + '}';
    }
    
    
}
