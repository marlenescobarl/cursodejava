import java.util.Scanner;
public class V12buclesfor
{
    public static void main (String args [])
    {
        Scanner go = new Scanner(System.in);
        int condicion = 0;

        System.out.println("CICLOS O BUCLES CON FOR");
        System.out.println("");
        System.out.println("Hasta que numero quiere llegar: ");
        condicion = go.nextInt();
        

        for (int i = 0; i <= condicion; i ++ )
        {
            System.out.print( i + " , ");
        }


    }
}