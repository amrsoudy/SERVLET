/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;

/**
 *
 * @author 1795162
 */
public class ListPersones extends ArrayList<Persone>{

    private static ListPersones listPersones;

    public static ListPersones getInstance() {

        if (listPersones == null) {
            
            listPersones = new ListPersones();
            return listPersones;

        }else{
        
        return listPersones ;
        
        }

    }

}
