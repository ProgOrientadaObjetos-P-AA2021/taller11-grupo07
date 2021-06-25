/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;

/**
 *
 * @author Renny
 */
public class Cuenta {

    protected String nomCliente;
    protected ArrayList<Menu> listaMenu = new ArrayList<>();
    protected double valTotal;
    protected double subtotal;
    protected double iva;

    public Cuenta(String nom, ArrayList<Menu> n, double iv) {
        listaMenu = n;
        nomCliente = nom;
        iva = iv;

    }

    public void establecerNomCliente(String n) {
        nomCliente = n;
    }

    public void establecerListaMenu(ArrayList<Menu> n) {
        listaMenu = n;
    }

    public void establecerSubtotal() {
        for (int i = 0; i < obtenerListaMenu().size(); i++) {
            subtotal = subtotal + obtenerListaMenu().get(i).obtenerValMenu();
        }
    }

    public void establecerIva(double n) {
        iva = n / 100;
    }

    public void establecerValTotal() {
        valTotal = subtotal + iva;
    }

    public String obtenerNomCliente() {
        return nomCliente;
    }

    public ArrayList<Menu> obtenerListaMenu() {
        return listaMenu;
    }

    public double obtenerValTotal() {
        return valTotal;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public double obtenerIva() {
        return iva;
    }

    @Override
    public String toString() {
        String cadena = String.format("======= C U E N T A - A - P A G A R ======\n"
                + "\tNombre del cliente: %s\n"
                + "\tSubtotal: %.2f $\n\tIva: %.2f $ \n"
                + "===========================================\n"
                + "============ Listado de Menus =============\n"
                + "===========================================\n\n", 
                nomCliente, subtotal, iva);

        for (int i = 0; i < listaMenu.size(); i++) {
            cadena = String.format("%s"
                    + "%s\n",
                    cadena,
                    listaMenu.get(i));
        }
        cadena = String.format("%sValor a cancelar total: %.2f $", 
                cadena, valTotal);

        return cadena;

    }

}
