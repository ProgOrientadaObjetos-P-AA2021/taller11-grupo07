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
public class MenuNin extends Menu {

    private double valHelado;
    private double valPastel;

    public MenuNin(String nom, double valIni, double valHel, double valPas) {
        super(nom, valIni);
        establecerValHelado(valHel);
        establecerValPastel(valPas);
    }

    public void establecerValHelado(double n) {
        valHelado = n;
    }

    public void establecerValPastel(double n) {
        valPastel = n;
    }

    @Override
    public void establecerValMenu() {
        valMenu = valHelado + valPastel;
    }

    public double obtenerValHelado() {
        return valHelado;
    }

    public double obtenerValPastel() {
        return valPastel;
    }

    @Override
    public String toString() {
        String cadena = String.format("-- Menu de niños --\n%s\n\tHelado: %.2f$\n"
                + "\tPastel: %.2f$\n", super.toString(), valHelado, valPastel);
        return cadena;
    }

}
