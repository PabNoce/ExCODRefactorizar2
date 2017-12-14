/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 * Contiene las operaciones a realizar durante el programa.
 * @author pnocedalopez
 */
public class Calculos {
/**
 * Calculo de la factorizacion.
 * @param j Numero a factorizar.
 * @return Numero ya factorizado.
 */
    public int calculoF(int j) {
        
        int f, i;
        
        if (j == 0) {
            f = 1;
        } else {
            f = 1;
            for (i = j; i >= 1; i--) {
                f = f * i;
            }
        }
        
        return f;
        
    }
}
