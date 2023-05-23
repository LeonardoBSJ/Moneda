
package moneda;

import java.util.Scanner;

public class solo_cambio {
    //operacciones metodo
   public static void muestra(){
       Scanner leer = new Scanner (System.in);
       
       int Arre[]={10,5,2,1};
       System.out.println("\tlas monedas predeterminadas son:");
       System.out.println("\t{10,5,2,1}");
       System.out.println("");
       System.out.println("\tIntroduce el numero para el cambio ");
       int numero=leer.nextInt();
       //llama
       int cambio[]=cambio2(numero,Arre);
       imprimir(cambio,Arre);
   } 
   public static int[] cambio2(int numero, int Arre[]){
       int cambio[] = new int [Arre.length];
       
       for (int i=0;i<Arre.length;i++){
           if (Arre[i]<=numero){
         cambio[i]= numero/Arre[i];
         numero = numero%Arre[i];
           }
       }
       //valor que se mantiene
       return cambio;
   }
   public static void imprimir(int cambio[],int Arre[]){
       System.out.println("\tSu cambio es:");
       for(int i=0; i<cambio.length;i++){
           if (cambio[i]>0){
               System.out.println(""+cambio[i]+" de "+Arre[i]+" pesos");
           }
       }
   }
}
