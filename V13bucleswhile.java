import java.util.Scanner;
public class V13bucleswhile
{
    public static void main (String args[])
    {
        Scanner go = new Scanner (System.in);

        int dato = 0, condicion = 0, b = 0;

        System.out.println("ESTRUCTURA CONDICIONAL WHILE :)");
        System.out.println("");
        System.out.println("Ingrese el numero a iniciar");
        dato = go.nextInt();
        System.out.println("Ingrese la condicion ");
        condicion = go.nextInt();
        System.out.println("Ingrese el salto ");
        b = go.nextInt();

        while (dato < condicion)
        {
            System.out.print( dato + " , ");
            dato += b;
        }



    }
}