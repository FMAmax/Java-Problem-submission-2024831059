import java.util.Scanner;
public class GivingBonuses {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int sls, atnd;
        System.out.println("Enter sales rate and attendance : ");
        sls = scn.nextInt();
        atnd = scn.nextInt();
        if(sls >= 95){
            if(atnd >= 100){
                System.out.println("Bonus 60%");
            }
            else if(atnd >= 90) System.out.println("Bonus 40");
            else System.out.println("Bonus 5%");
        }
        else if( sls >=80){
            if(atnd >= 100) System.out.println("Bonus 40%");
            else if(atnd >= 90) System.out.println("Bonus 20%");
            else System.out.println("Bonus 5%");
        }
        else System.out.println("Bonus 5%");

    }
}
