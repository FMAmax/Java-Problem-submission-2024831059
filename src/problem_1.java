import java.util.Scanner;

class problem_1 {

    public static double triangle_area_1(double ht, double bs){
        return 0.5*ht*bs;
    }
    public static double ball_vlm(double rds){
        return (4.0/3.0)*Math.PI*Math.pow(rds,3);
    }
    public static double crcl_area(double rds){
        return Math.PI*Math.pow(rds,2);
    }
    public static double Cl_to_Fr(double cl){
        return (cl * 9.0 / 5.0) + 32.0;
    }
    public static double eq_trngl(double lnth){
        return (Math.sqrt(3) / 4.0) * Math.pow(lnth, 2);
    }
    public static double tirangle_area_2(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("1. Area of Triangle (h=10,b=5): %.2f \n", triangle_area_1(10, 5));
        System.out.printf("2. Volume of Ball (r=3): %.2f \n", ball_vlm(3));
        System.out.printf("3. Area of Circle (r=5): %.2f \n", crcl_area(5));
        System.out.printf("4. Celsius to Fahrenheit (37°C): %.2f°F \n", Cl_to_Fr(37));
        System.out.printf("5. Area of Equilateral Triangle (arm=6): %.2f \n", eq_trngl(6));
        System.out.printf("6. Area of Triangle via Heron (a=3, b=4, c=5): %.2f \n", tirangle_area_2(3, 4, 5));
    }
}