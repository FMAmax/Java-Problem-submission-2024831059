import java.util.Scanner;

class PositiveIntegerCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number > 0) {
                System.out.println(number + " is a positive integer.");
            } else if (number == 0) {
                System.out.println("0 is an non negative integer");
            } else {
                System.out.println(number + " is a negative integer.");
            }
        } else {
            String invalidInput = scanner.next();
            System.out.println( invalidInput + " is not a valid integer.");
        }

        scanner.close();
    }
}