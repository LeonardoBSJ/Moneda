
package moneda;

import java.util.Scanner;


public class Moneda {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("\tComo quiere realizar su cambio?");
        System.out.println("\t1.Introduciendo todos los parametros");
        System.out.println("\t2.Solo la cantidad a cambiar");
        int op = leer.nextInt();
        switch (op){
            case 1:
                Manual.manual();
                break;
            case 2:
               solo_cambio.muestra();
                break;
            default:
                break;
                
        }
    
    }
    
}
