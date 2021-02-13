import java.util.*;
public Practica
{
    public static void maint(String args[])
    {
        //declaration of variables
        Scanner go = new Scanner(System.in);
        int fact1 = 0, fact2 = 0, fact3 = 0;
        String name = "";

        System.out.printl("__________________________________________________________");
        System.out.printl("|                 KNOWLEDGE PRACTICE                      |");
        System.out.printl("|_________________________________________________________|");
        System.out.printl("");

        //data entry
        System.out.printl("Enter your name");
        name = go.nextLine();
        System.out.printl("Hi! "+ name + " enter the first number");
        fact1 = go.nextInt();

        //menu
        System.out.printl("What operation do you want");
        System.out.printl("");
        System.out.printl("option 1: sum");
        System.out.printl("option 2: subtraction");
        System.out.printl("option 3: multiplication");
        System.out.printl("option 4: division");
        System.out.printl("option 5: combined operations");

        

    }

}