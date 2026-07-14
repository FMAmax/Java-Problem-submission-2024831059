import java.util.Scanner;
public class JavaCalculator {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter A : ");
        int a = scn.nextInt();
        System.out.println("Enter B : ");
        int b = scn.nextInt();
        System.out.println("Operation : + , - , *, / ");

        char c = scn.next().charAt(0);
        if(c == '+')
        {
            System.out.println(" A + B = " + (a+b));
        }
        else if(c == '-')
        {
            System.out.println(" A - B = " + (a-b));
        }
        else if(c == '*')
        {
            System.out.println(" A * B = " + (a*b));
        }
        else if(c == '/')
        {
            if(b==0){
                System.out.println(" Cannot divide by zero");
            }
            else {
                System.out.println(" A - B = " + (a / b));
            }
        }
        scn.close();

    }
}
