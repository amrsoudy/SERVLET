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
public class listFormation {

    private ArrayList list = new ArrayList();

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }

    public listFormation() {

        list.add(new Formation(1, "Java", "Monteal"));
        list.add(new Formation(2, "Struts", "Laval"));
        list.add(new Formation(3, "CSS", "Montréal"));
        list.add(new Formation(4, "Html", "Quebec"));
        list.add(new Formation (5, "Java", "Quebec"));
        list.add(new Formation(6, "Html", "Montréal"));

    }

}
