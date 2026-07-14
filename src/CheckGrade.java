import java.util.Scanner;
public class CheckGrade {
    public static void main(String[] args){
         System.out.print("Enter a number : ");
         Scanner scn = new Scanner(System.in);
         int num = scn.nextInt();
         if(num<0 || num>100){
             System.out.println(" Invalid number ");
         }
         else if( num>=90){
             System.out.println("A+");
         }
         else if( num>=80){
             System.out.println("A");
         }
         else if( num>=70){
             System.out.println("A-");
         }
         else if( num>=60){
             System.out.println("B");
         }
         else if( num>=40){
             System.out.println("C+");
         }
         else
             System.out.println("F");
         scn.close();
    }
}
