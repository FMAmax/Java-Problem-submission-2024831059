import java.util.Scanner;
public class Letter_grade_checker {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("If grade is lower than 2.0 semester failed else passed\nEnter grade: ");
        double grade = scn.nextDouble();
        if(grade>2.0){
            if(grade>3.5){
                System.out.println("Completed semester with letter grade");
            }
            else{
                System.out.println("Completed semester");
            }

        }
        else System.out.println("Failed the semester");
        scn.close();
    }
}
