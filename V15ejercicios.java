public class V15ejercicios
{
    public static void main (String args [])
    {
        int i = 0;
        System.out.println("Ciclos con estructuras condicionales");
        System.out.println("");
        System.out.println("Ciclo con FOR");

        //impresion en pantalla de: 1,2,3,4,5,6,7,8,9,10
        // inicio  instruccion aumento
        for (i = 1; i <=10; i ++)
        {
            //instruccion
            if (i < 10)
            {
                System.out.print(i + ","); // imprimira en pantala el valor de i y despues la coma
            } 
            else 
            {
                System.out.print(i ""); // se condiciona que al ser menor que 10 despues de, ya no se imprimira la ,
            }

        }
    }
}