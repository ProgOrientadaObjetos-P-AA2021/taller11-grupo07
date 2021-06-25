/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;

/**
 *
 * @author xavierchavez
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Menu> listaMenu = new ArrayList<>();

        MenuNin nin = new MenuNin("Sándwich de quese", 3.00, 1.5, 5.2);
        MenuNin nin2 = new MenuNin("Khachapuri ", 4.00, 2.5, 6.2);
        MenuEconomico me = new MenuEconomico("Ćevapi", 4.5, 12);
        MenuDia md = new MenuDia("Sushi", 4.5, 0.30, 1.20);
        MenuCarta mc = new MenuCarta("Spaghetti a la carbonara", 5.3, 6.2, 1.15, 14);
        listaMenu.add(nin);
        listaMenu.add(nin2);
        listaMenu.add(me);
        listaMenu.add(md);
        listaMenu.add(mc);
        for (int i = 0; i < listaMenu.size(); i++) {
            listaMenu.get(i).establecerValMenu();
        }
        Cuenta cuen = new Cuenta("Xavier", listaMenu, 14);
        cuen.establecerSubtotal();
        cuen.establecerValTotal();
        System.out.println(cuen);

    }

}
