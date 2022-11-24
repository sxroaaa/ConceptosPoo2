package estaticas;
import java.util.Scanner;
public class Reto7 {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        int Cn;
        System.out.println("ingrese la cantidad de notas a evaluar");
        Cn= leer.nextInt();
        double total=0.0, promedio=0.0;
        double [] notas=new double[Cn];
        for (int i=0; i<notas.length; i++){
          System.out.println("ingrese del 1 al 5 el valor de la nota " +i);
          notas[i]=leer.nextDouble();
        
          total= total + (notas[i]);
          promedio=total/(notas[i]);
        }

        System.out.println(promedio);
         if (promedio<3.0){
            System.out.println("usted reprobo la materia");
         }

         else if (promedio >=3.0 || promedio <=4.0){
            System.out.println("usted paso raspando la materia");

         }
         else if(promedio>4.0){
            System.out.println("usted aprobo con buenos resultados");
         }

         leer.close();
    }

   
}