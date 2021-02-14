import java.util.*;
public class Practice
{
    public static void main(String args[])
    {
        //declaration of variables
        Scanner go = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0, answer = 0, option = 0;
        String name = "";

        System.out.println("__________________________________________________________");
        System.out.println("|                 KNOWLEDGE PRACTICE                      |");
        System.out.println("|_________________________________________________________|");
        System.out.println("");

        //data entry
        System.out.print("Enter your name: ");
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
        option = go.nextInt();

        
        switch(option)
        {
            case 1: answer = (num1 + num2 + num3);
                    System.out.println("The answer is: " + answer);
                    break;
            case 2: answer = (num1 - num2 - num3);
                    System.out.println("The answer is: " + answer);
                    break;
            case 3: answer = (num1 * num2 * num3 );
                    System.out.println("The answer is: " + answer);
                    break;
            case 4: answer = (num1 / num2 / num3);
                    System.out.println("The answer is: ");
                    break;
            case 5: if(num1 > num2 && num1 > num3)
                    {
                        answer = (num1 / num3) * num2;
                        System.out.println("The answer of operation is: " + answer);
                    } 
                    else if(num2 > num1 && num2 > num3)
                    {
                        answer = (num2 / num3) * num1;
                        System.out.println("The answer of operation is: " + answer);
                    } 
                    else if(num3 > num1 && num3 > num2)
                    {
                        answer = (num3 / num1) * num2;
                        System.out.println("The answer of operation is: " + answer);
                    } 
                    if(answer < 0)
                    {
                        System.out.println("");
                        System.out.println("The answer is NEGATIVE: ");
                        System.out.println("");
                    }
                    break;
            default: System.out.println("ERROR! the option entered does not exist");
                     break;
        }

    }

}