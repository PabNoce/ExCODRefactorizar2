package factorial;
/**
 * Programa que calcula la factorizacion del numero 8.
 * @author pnocedalopez
 */
public class Factorial {
/**
 * Metodo principal
 * @param args 
 */
    public static void main(String[] args) {
        
        Calculos calculos = new Calculos();

        int j = 8, f;

        f=calculos.calculoF(j);
      
        System.out.println(f);

    }

}
