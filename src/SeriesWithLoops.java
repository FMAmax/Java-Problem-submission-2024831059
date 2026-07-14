import java.awt.*;
import java.util.Scanner;
public class SeriesWithLoops {
    public static void main(String[] args){
        System.out.print("Even series with for loop : \n");
//        Scanner scn = new Scanner(System.in);
        int SumEven = 0;
        for(int i =2; i<20 ;i+=2){
            System.out.print(i + " ");
            SumEven += i;
        }
        System.out.println("\nSum of Even Series: " + SumEven + "\n");
        int sumOdd = 0;
        System.out.println("Odd series with while loop :");
        int i =1;
        while(i<20){
            System.out.print(i + " ");
            i+=2;
            sumOdd+= i;
        }
        System.out.println("\nSum of Even Series: " + sumOdd + "\n");

        System.out.print("Both series with Do while loop");

        int evenSum = 0;
        int even = 2;
        System.out.print("Even Series: ");
        do {
            System.out.print(even + " ");
            evenSum += even;
            even += 2;
        } while (even <= 20);
        System.out.println("Sum: " + evenSum);

        int oddSum = 0;
        int odd = 1;
        System.out.print("Odd Series:  ");
        do {
            System.out.print(odd + " ");
            oddSum += odd;
            odd += 2;
        } while (odd <= 19);
        System.out.println("Sum: " + oddSum);


    }
}
