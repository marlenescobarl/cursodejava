import java.util.*;
public class V18contadortexto
{
    public static void main (String args [])
    {
        Scanner go = new Scanner (System.in);
        //   lo que ingresa el usuario  / variable para guardar la sustraccion del metodo substring
        String cadena_original = "", sustraccion = "";
        // numero de carateres, / para el metodo substring
        int num_caracteres = 0, desde = 0, hasta = 0;

        System.out.print("Ingrese la cadena de texto: ");
        cadena_original = go.nextLine();

        // metodo para contar los caracteres totales que se almacenan en la varibale num_caracteres

        num_caracteres = cadena_original.length();

        System.out.println("la cadena: " + cadena_original + " tiene : " + num_caracteres +  " caracteres");

        // proceso para el metodo Substring

        System.out.print("Desde que caracter desea obtener a nueva cadena: " );
        desde = go.nextInt();
        System.out.print("Hasta que caracter desea obtener a nueva cadena: " );
        hasta = go.nextInt();


        sustraccion = cadena_original.substring(desde, hasta);

        System.out.println("La nueva cadena es: " + sustraccion);
        
    }
}