import java.util.Scanner;
public class Promediodatos
{
    public static void main (String args [])
    {
        Scanner mb = new Scanner (System.in);

        String name = "";
        int mate = 0, lenguaje = 0, ingles = 0, sociales = 0, naturales = 0;
        int promedio = 0;

        System.out.println("Ingresa el nombre del alumno");
        name = mb.nextLine();
        System.out.println("ingresa las notas de los siguientes cursos");
        System.out.println("Matematica: ");
        mate = mb.nextInt();
        System.out.println("Comunicacion y Lenguaje: ");
        lenguaje = mb.nextInt();
        System.out.println("Idioma Ingles: ");
        ingles = mb.nextInt();
        System.out.println("Ciencias Sociales: ");
        sociales = mb.nextInt();
        System.out.println("Ciencias Naturales: ");
        naturales = mb.nextInt();

        promedio = ((mate + lenguaje + ingles + sociales + naturales)/5);

        System.out.println("El promedio de " + name + " es de: " + promedio);

        if (promedio >= 60)
        {
            System.out.println("APROBADO");
        }else {
            System.out.println("REPROBADO");
        }
    }
}