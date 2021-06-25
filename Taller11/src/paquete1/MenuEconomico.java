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
public class MenuEconomico extends Menu {

    private double porcentaje;

    public MenuEconomico(String nom, double valIni, double porc) {
        super(nom, valIni);
        establecerPorcentaje(porc);
    }

    public void establecerPorcentaje(double n) {
        porcentaje = n;
    }

    @Override
    public void establecerValMenu() {
        valMenu = valIniMenu - (porcentaje / 100);
    }

    public double obtenerPorcentaje() {
        return porcentaje;
    }

    @Override
    public String toString() {
        String cadena = String.format("============== Menu Economico =============\n%s\n"
                + "\tPorcentaje de descuento: %.2f $\n"
                + "\tValor Menu: %.2f\n", super.toString(), 
                porcentaje,valMenu);
        return cadena;
    }

}
