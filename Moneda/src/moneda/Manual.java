package moneda;

import java.util.Scanner;
import static moneda.procedimiento_Manual.cambio;
import static moneda.procedimiento_Manual.imprim;

public class Manual {

    public static void manual() {
        Scanner leer = new Scanner(System.in);
        System.out.println("\nIntroduce la cantidad de monedas que dispone para el (cambio)");
        int tamaño = leer.nextInt();
        int A[] = new int[tamaño];
        for (int i = 0; i < A.length; i++) {
        System.out.println("\nIntroduce el valor de la moneda " + (i+1) + " (cambio)");
            A[i] = leer.nextInt();
        }
        //ordenamiento del arreglo de mayor a menor
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length - 1; j++) {// se compara a si mismo

                if (A[j] < A[j + 1]) {
                    int aux;
                    aux = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = aux;
                }
            }
        }
        //imprime el arreglo ordenado
        System.out.println("Las monedas son:");
        for (int orden : A) {
            System.out.print("[" + orden + "], ");
            //tiempo de espera antes de volver al for
            try {
                Thread.sleep(700);
            } catch (Exception e) {

            }
        }
        System.out.println("");
        System.out.println("ingrese el valor a dar cambio:");
        int numero = leer.nextInt();
        System.out.println("");
        //llama al cambio
        int cambio[] = cambio(numero, A);
        imprim(cambio, A);
    }

}
