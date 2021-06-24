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
public class Cuenta{

    protected String nomCliente;
    protected ArrayList<Menu> listaMenu = new ArrayList<>();
    protected double valTotal;
    protected double subtotal;
    protected double iva;

    public void establecerNomCliente(String n) {
        nomCliente = n;
    }

    public void establecerListaMenu(ArrayList<Menu> n) {
        listaMenu = n;
    }

    public void establecerValTotal(){
        
    }

    public void establecerSubtotal(double n) {
        subtotal = n;
    }

    public void establecerIva(double n) {
        iva = n;
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

}
