import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        if (number1 > number2) {
            if (number1 > number3) {
                System.out.println("The largest number is " + number1);
            } else {
                System.out.println("The largest number is " + number3);
            }
        } else {
            if (number2 > number3) {
                System.out.println("The largest number is " + number2);
            } else {
                System.out.println("The largest number is " + number3);
            }
        }
    }
}
