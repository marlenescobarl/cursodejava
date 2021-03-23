public class V21vectoresbidimencionales
{
    public static void main (String args [])
    {
        System.out.println("VECTORES BIDIMENCIONALES");
        System.out.println("");

        //declaracion del vector
        int numeros [][] = new int [2][2];

        //asignar los valores
        numeros [0][0] = 5;
        numeros [0][1] = 2;
        numeros [1][0] = 2;
        numeros [1][1] = 5;

        //impresion de los vectores

        System.out.print("[ " + numeros [0][0] + " ]");
        System.out.println("[ " + numeros [0][1] + " ]");
        System.out.print("[ " + numeros [1][0] + " ]");
        System.out.println("[ " + numeros [1][1] + " ]");

        



    }
}