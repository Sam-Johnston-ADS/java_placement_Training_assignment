import java.util.*;

class PrimeInRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter upper limit N: ");
        int N = sc.nextInt();

        int count = 0;
        System.out.println("Prime numbers are:");

        for (int i = 2; i <= N; i++) {

            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;  
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nCount of prime numbers: " + count);
    }
}
