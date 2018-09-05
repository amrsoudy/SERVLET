/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author 1795162
 */
public class Obj {
    
    String name  ;
    String[] location ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getLocation() {
        return location;
    }

    public void setLocation(String[] location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Obj{" + "name=" + name + ", location=" + location + '}';
    }
    
    
}
