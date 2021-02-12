import java.util.Scanner;

public class Ingresodedatos
{
    public static void main ( String args [])
    {
        Scanner in = new Scanner (System.in);

        String nombre = "";
        int num1 = 0, num2 = 0, resultado = 0;

        System.out.println("Ingresa tu nombre");
        nombre = in.nextLine();

        System.out.println("Ingresa el primer valor para la suma");
        num1 = in.nextInt();
        System.out.println("Ingresa el segundo valor para la suma");
        num2 = in.nextInt();

        resultado = num1 + num2;

        System.out.println("Hola " + nombre + " el esultado de la suma es: " + resultado);
    }
}