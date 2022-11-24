package estaticas;
import java.util.Scanner;
public class Reto8 {
   
    public static void main(String[] args) {
        int NumeroC, ganador=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el numero de competidores:");
        NumeroC=leer.nextInt();

        String[] nombre=new String [NumeroC]; 
        int[] tiempo=new int[NumeroC];

        for (int i=0; i<nombre.length; i++){
            System.out.println("ingrese el nombre del participante " +i );
            nombre[i]= leer.nextLine();
           
        }
        leer.nextLine();
       
        for(int i=0; i< tiempo.length; i++){
            System.out.println("ingrese el tiempo del competidor " +i+  " en segundos " );
            tiempo[i]=leer.nextInt();
          
        }

        for(int i=0; i<tiempo.length; i++){
            
            if (tiempo[i] > ganador){
                ganador= tiempo[i];
            }
        }

        leer.close();

       System.out.println("en la competencia hay un total de " +NumeroC+ " participantes " );
        
    }
}
