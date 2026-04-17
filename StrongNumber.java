import java.util.*;

class StrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int totalSum = 0;

        while (temp > 0) {
            int digit = temp % 10;  
            
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            totalSum = totalSum + fact;
            temp = temp / 10;
        }

        if (totalSum == num) {
            System.out.println("Strong");
        } else {
            System.out.println("Not Strong");
        }
    }
}
