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
                System.out.print(i + ", "); // imprimira en pantala el valor de i y despues la coma
            } else 
            {
                System.out.print(i); // se condiciona que al ser menor que 10 despues de, ya no se imprimira la ,
            }

        }
        //se iguala la varibale a 1 nuevamnte para que vuelva a iniciar el ciclo
        System.out.println("");
        i = 1;
        System.out.println("Ciclo con while");

        //impresion en pantalla de: 1,2,3,4,5,6,7,8,9,10
        // se da de una vez la condicion
        while( i <= 10)
        {   
            //si es igual a 10, entonces imprime  seguido de coma
            if ( i < 10)
            {
                System.out.print(i + ", ");
            }else // de lo contrario imprime lo siguiente sin coma
            {
                System.out.print(i); 
            }
            i ++ ; // para cerrar el ciclo, el incremento
        }
        //impresion en pantalla de: 1,2,3,4,5,6,7,8,9,10
        // regresar a la variable al valor que se esta manejando
        i = 1;
        System.out.println("");
        System.out.println("Ciclo con do - while");
        do
        {
            if(i < 10)
            {
                System.out.print(i + ", ");
            }else{
                System.out.print(i);
            }
            i ++;

        }while(i <= 10); //va la condicion
    }
}