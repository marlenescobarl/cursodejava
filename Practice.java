import java.util.*;
public class Practice
{
    public static void main(String args[])
    {
        //declaration of variables
        Scanner go = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0, answer = 0, parameter = 0;
        String name = "";

        System.out.println("__________________________________________________________");
        System.out.println("|                 KNOWLEDGE PRACTICE                      |");
        System.out.println("|_________________________________________________________|");
        System.out.println("");

        //data entry
        System.out.print("Enter your name");
        name = go.nextLine();
        System.out.println("");
        System.out.println("Hi! "+ name + " enter the numbers: ");
        System.out.print("First number:  ");
        num1 = go.nextInt();
        System.out.print("Second number: ");
        num2 = go.nextInt();
        System.out.print("Third number: ");
        num3 = go.nextInt();
        System.out.println("");

        //menu
        System.out.println("What operation do you want");
        System.out.println("option 1: sum");
        System.out.println("option 2: subtraction");
        System.out.println("option 3: multiplication");
        System.out.println("option 4: division");
        System.out.println("option 5: combined operations");


    }

}