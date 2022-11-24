package estaticas;
import java.util.Scanner;
public class Reto3 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        String [][] maquina= {{"Gansito", "gol" , "brownie ramo",  "jumbo" },{"kit kat", "huevo kinder", "chokis", "Oreo"}, {"nucita", "cocossette", "pekitas", "galletas milo"},{"M&M", "todo rico", "submarino", "jet"}};

        int [][] precio={{1200, 1000, 2200, 2500}, {900, 6000, 1200, 1000}, {800, 1600, 1500, 1000}, {5000, 2000, 1000, 500}};

            for (int fila=0; fila<5; fila++){

                for(int columna=0; columna<4; columna++){
                    System.out.println(" " + fila + columna + " ");
                     System.out.println(" " +maquina [fila][columna] + " "+ precio[fila][columna]) ; 
                }
               
            }
    }

}
