import java.util.*;
public class V17cadenastexto 
{
    public static void main (String args[])
    {
        /*
        Realizar un programa que compare dos nombres para verificar si son iguales
        y mostrar un mensaje dependientemente del resultado. ingreso de datos
        usando el metodo de comparacion de canedas de texto 
        equals();
         */
         //     objeto
         String nombre_uno = "", nombre_dos = "";
         Scanner entrada = new Scanner (System.in);

         System.out.print("Ingrese el primer nombre: ");
         nombre_uno = entrada.nextLine();

         System.out.println("");

         System.out.print("Ingrese el segundo nombre: ");
         nombre_dos = entrada.nextLine();

         System.out.println(""); 
         //condicion para hacer la comparaaion de los textos
         if(nombre_uno.equals(nombre_dos))
         {
             System.out.println("Los nombres ingresados son iguales");
         }else
         {
             System.out.println("Los nombres ingresados son diferentes");
         }


    }
}