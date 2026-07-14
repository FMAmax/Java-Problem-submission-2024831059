import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter year : ");
        int year = scn.nextInt();
        if((year%400 == 0) || (year%4==0 && year%100!=0)){
            System.out.println(year + " Is a leap year ");

        }
        else {
            System.out.println(year + " Is not a leap year ");
        }
        scn.close();
    }
}
