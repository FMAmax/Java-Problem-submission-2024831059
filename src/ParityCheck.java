import java.util.Scanner;

public class ParityCheck {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number :");
        int a = scn.nextInt();
        if(a%2!=0){
            System.out.println(a + " Is an odd number");
        }
        else{
            System.out.println(a + " Is an even number" );
        }
        scn.close();
    }
}
