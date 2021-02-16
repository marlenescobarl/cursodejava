public class V14dowhile
{
    public static void main (String args [])
    {
        int i = 1000;

        System.out.println("PRACTICA DE DOWHILE");
        System.out.println("");
        System.out.println("Imprimir el decremento 1000 restando 200");

        do {
            System.out.print( "" + i + ",");

            i -= 200;
        } while (i >= 0);

    }
}