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
public class MenuCarta extends Menu {

    private double valGuarnicion;
    private double valBebida;
    private double porcentaje;

    public MenuCarta(String nom, double valIni, double valGuar,
            double valBeb, double porc) {
        super(nom, valIni);
        establecerValGuarnicion(valGuar);
        establecerValBebida(valBeb);
        establecerPorcentaje(porc);
    }

    public void establecerValGuarnicion(double n) {
        valGuarnicion = n;
    }

    public void establecerValBebida(double n) {
        valBebida = n;
    }

    public void establecerPorcentaje(double n) {
        porcentaje = n;
    }

    @Override
    public void establecerValMenu() {
        valMenu = valIniMenu + valBebida + valGuarnicion
                + (valIniMenu * (porcentaje / 100));
    }

    public double obtenerValGuarnicion() {
        return valGuarnicion;
    }

    public double obtenerValBebida() {
        return valBebida;
    }

    public double obtenerPorcentaje() {
        return porcentaje;
    }

    @Override
    public String toString() {
        String cadena = String.format("============= Menu a la Carta =============\n%s\n"
                + "\tValor Guarnicion: %.2f$ \n\tValor Bebida: %.2f $\n"
                + "\tPorcentaje adicional: %.2f $\n\tValor menu: %.2f\n", super.toString(),
                valGuarnicion, valBebida, porcentaje, valMenu);
        return cadena;
    }

}
