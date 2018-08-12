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
public class ListClient extends ArrayList<Persone> {

    private static ListClient listClient;

    public static ListClient getInstance() {
        if (listClient == null) {

            listClient = new ListClient();
            Persone p = new Persone("amr", "0000", "a@a.com");
            listClient.add(p);
            return listClient;

        } else {
            Persone p = new Persone("amr", "0000", "a@a.com");
            listClient.add(p);
            return listClient;
        }

    }

    public static ListClient getListClient() {

        return listClient;
    }

}
