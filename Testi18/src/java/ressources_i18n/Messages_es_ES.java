/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ressources_i18n;

import java.util.ListResourceBundle;

/**
 *
 * @author 1795162
 */
public class Messages_es_ES extends ListResourceBundle{
  
    
    static final Object[][] contnets ={
    
        {"count.one","Uno"},
        {"count.two","Dos"},
        {"count.two","Tres"}
    
    };

    @Override
    protected Object[][] getContents() {
    return contnets ;
    }
}
