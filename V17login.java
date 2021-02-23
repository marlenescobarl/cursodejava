import java.util.*;
public class V17login 
{
    public static void main (String args [])
    {
         /*Realizar un programa que simule el inicio de sesion solicitando el nombre de usuario
         y contrasena, para compararlos y mostrar un mensaje en pantalla que diga:
         inicio de sesion correctos/ nombre de usurario o password incorrectos
          */
        Scanner entrada = new Scanner (System.in);
        String usuario = "", password = "";

        System.out.println("EJERCICIO DOS");
        System.out.println("");
        System.out.print("Ingrese su nombre de usuario: ");
        usuario = entrada.nextLine();
        System.out.println("");
        System.out.print("Ingrese su password: ");
        password = entrada.nextLine();

        if(usuario.equals("marlen") && password.equals("12345"))
        {
            System.out.println("Inicio de sesion correcto");
        }else
        {
            System.out.println("Usuario o password incorrectos");
        }

    }

}
        
        
        
        
        
