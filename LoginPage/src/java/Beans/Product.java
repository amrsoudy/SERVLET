/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author AMR
 */
public class Product {
    
   private String name ;
   private double price ;
    private String img ;

    public Product(String name, double Price, String Img) {
        this.name = name;
        this.price = Price;
        this.img = Img;
    }
    
    

    public String getImg() {
        return img;
    }

    public void setImg(String Img) {
        this.img = Img;
    }
    

    
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double Price) {
        this.price = Price;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", Price=" + price + ", Img=" + img + '}';
    }

  
    
    
}
