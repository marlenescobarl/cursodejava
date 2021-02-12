import java.util.Scanner;

public class Estructurasanidadas7
{
    public static void main (String args [])
    {
        Scanner datos = new Scanner(System.in);

        System.out.println("_____________________________________________________________________");
        System.out.println("|    Operaciones con estructuras condicionales anidadas if - else   |");
        System.out.println("_____________________________________________________________________");
        System.out.println("");

        int operacion      = 5;
        int num1           = 8;
        int num2           = 4;
        int resultado      = 0;

        if (operacion ==1)
        {
            resultado = num1 + num2;
            System.out.println ("Resultado de la suma es: " + resultado);
        } else if ( operacion == 2)
        {
            resultado = num1 - num2;
            System.out.println("Resultado de la resta es: " + resultado);
        } else if (operacion == 3)
        {
            resultado = num1 * num2;
            System.out.println ("Resultado de multiplicacion es: " + resultado);
        } else if (operacion ==4)
        {
            resultado = num1 / num2;
            System.out.println ("Resultado de la division es: " + resultado);
        } else
            {
                System.out.println ("La operacion ingresada es incorrecta");
            }

    }
}