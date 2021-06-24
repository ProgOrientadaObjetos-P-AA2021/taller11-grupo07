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

}
