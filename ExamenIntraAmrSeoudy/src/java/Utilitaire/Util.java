/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitaire;

import java.util.ArrayList;
import modele.Formation;
import modele.listFormation;

/**
 *
 * @author 1795162
 */
public class Util {
    
    listFormation list = new listFormation();
    ArrayList<Formation> lists = list.getList();

    public ArrayList traiter(String lang) {
        ArrayList<Formation> listForm = new ArrayList();
        for(Formation f :lists){
            if((f.getFormation().toLowerCase()).equals(lang)){
            listForm.add(f);
            
            }
        
        }
        return listForm ;
    }
    
 
    
}
