import java.util.Scanner;
public class array_average {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input count of numbers (array size) : ");
        int n = scn.nextInt();
        double[] arr = new double[n];
        double sum=0;
        System.out.println("Enter " + n + " numbers : ");
        for(int i =0;i<n;++i){
            arr[i]= scn.nextDouble();
            sum+=arr[i];
        }
        System.out.println("Average of " + n + " numbers : "+ sum/n);
        scn.close();
    }
}
