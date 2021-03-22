import java.util.Scanner;
public class V20vectoresdinamicos 
{
    public static void main (String args [])
    {
        int longitud = 0;
        Scanner go = new Scanner(System.in);

        System.out.println("ARRAYS DINAMICOS");
        System.out.println("");
        System.out.print("Cuantos numeros desea ingresar: ");
        System.out.println("");
        longitud = go.nextInt();
        //declar el array
        int numeros [] = new int [longitud];

        //para imprimir y pedir los datos que iran en el array
        for (int i = 0; i < numeros.length; i ++)
        {
            System.out.println("Deme un numero # " + (i + 1)); // se suma 1 para que inicie desde uno
            numeros[i] = go.nextInt();
        }
        // for para el array
        for(int i = 0; i < numeros.length; i ++ )
        {
            System.out.println("[ " + numeros[i] + " ]");
        }


    }
}