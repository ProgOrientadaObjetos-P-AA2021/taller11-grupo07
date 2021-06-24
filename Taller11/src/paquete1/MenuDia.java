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
public class MenuDia extends Menu{
    private double valPostre;
    private double valBebida;

    public MenuDia(String nom, double valIni, double valPos, double valBeb) {
        super(nom, valIni);
    }
    
    public void establecerValPostre(double n){
        valPostre = n;
    }
    
    public void establecerValBebida(double n){
        valBebida = n;
    }
    
    @Override
    public void establecerValMenu() {
        valMenu = valIniMenu + valPostre + valBebida;
    }
    
    public double obtenerValPostre(){
        return valPostre;
    }
    
    public double obtenerValBebida(){
        return valBebida;
    }

    
    
}
