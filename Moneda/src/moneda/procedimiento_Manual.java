package moneda;
public class procedimiento_Manual {
   public static int[] cambio(int numero,int A[]){
       //
        int cambio[] = new int [A.length];
        for (int i=0;i<A.length;i++){
            if(A[i]<=numero){
            cambio[i]=numero/A[i];
            numero=numero%A[i];
        }
        }
        return cambio;
    }
   public static void imprim(int cambio[],int A[]){
       //mostrar cuantas monedas de cada tipo para el cambio
       System.out.println("\tSu cambio es:");
       for (int i=0;i<cambio.length;i++){
           if(cambio[i]>0){
               System.out.println(" "+cambio[i]+" de "+A[i]+" pesos.");
           }else{
               System.out.println("falla");
           }
       }
   }
}
