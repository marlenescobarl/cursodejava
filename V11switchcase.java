import java.util.Scanner;
public class V11switchcase
{
    public static void main (String args [])
    {
        Scanner go = new Scanner(System.in);

        int num1 = 8, num2 = 5, resultado = 0;
        int parametro = 0;

        System.out.println("Estructuras de control con SWITCH CASE");
        System.out.println("Ingrese la opcion deseada");
        parametro = go.nextInt();


        switch (parametro)
        {
            case 1: resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
            
            case 2: resultado = num2 - num1;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;

            case 3: resultado = num1 + num2;
                    System.out.println("El resultado de la MULTIPLICACION es: " + resultado);
                    break;
            
            case 4: resultado = num2 - num1;
                    System.out.println("El resultado de la DIVISION es: " + resultado);
                    break;

            default: System.out.println("Error, opcion ingresada NO EXISTE");
                     break;        
        }
    }
}