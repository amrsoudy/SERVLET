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
public class Messages_en_US extends ListResourceBundle {
   
    static final      Object[][] contents = {
        {"count.one","one"},
        {"count.two" ,"two"},
        {"count.three","Three"}
    
    };

    @Override
    protected Object[][] getContents() {
    return contents;

    }
    
}
