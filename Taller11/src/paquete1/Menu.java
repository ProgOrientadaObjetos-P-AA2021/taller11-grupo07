/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Renny
 */
public abstract class Menu {

    protected String nomPlato;
    protected double valMenu;
    protected double valIniMenu;

    public Menu(String nom, double valIni) {
        nomPlato = nom;
        valIniMenu = valIni;
    }

    public void establecerNomPlato(String n) {
        nomPlato = n;
    }

    public abstract void establecerValMenu();

    public void establecerValIniMeni(double n) {
        valIniMenu = n;
    }

    public String obtenerNomPlato() {
        return nomPlato;
    }

    public double obtenerValMenu() {
        return valMenu;
    }

    public double obtenerValIniMenu() {
        return valMenu;
    }

    @Override
    public String toString() {
        String cadena = String.format("\tPlato: %s\n"
                + "\tValor inicial del menu: %.2f$", nomPlato, valIniMenu);
        return cadena;
    }

}
