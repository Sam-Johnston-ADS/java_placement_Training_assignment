import java.util.*;

class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int digits = 0;
        int temp = num;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        int sum = 0;
        temp = num;
        while (temp > 0) {
            int lastDigit = temp % 10;

            int power = 1;
            for (int i = 1; i <= digits; i++) {
                power = power * lastDigit;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }
}
