import java.util.*;
public class V23matricesdinamicas 
{
    
    public static void main (String args [])
    {
        //variables globales
        int filas = 0, columnas = 0, contador = 1; //iniciado en 1 para que no inicie desde cero
        Scanner go = new Scanner(System.in);
        System.out.println("      MATRICES DINAMICAS");
        System.out.println("________________________________");
        System.out.println("");
        System.out.print("Cuantas filas desea: ");
        filas = go.nextInt();
        System.out.println("");
        System.out.print("Cuantas columnas desea: ");
        columnas = go.nextInt();
        System.out.println("");

        //declaracion de la matriz
        int matriz [][] = new int [filas][columnas];
        
        //ciclo para indicar la hubicacion de las filas
        for (int i = 0; i < filas; i ++)
        {
            //ciclo for para indicar la hubicacion de las columnas
            for (int j = 0; j < columnas; j ++)
            {
                matriz[i][j] = contador;
                contador ++;
                System.out.print("[ " + matriz [i][j] + "]" );
            }
            //salto de linea para formar la matriz
            System.out.println("");
        }
        System.out.println("");
        System.out.println("GRACIAS POR USAR EL PROGRAMA");

    }
}
