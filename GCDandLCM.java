import java.util.*;

class GCDandLCM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int gcd = 1;
        int smaller = a;
        if (b < a) {
            smaller = b;
        }

        for (int i = 1; i <= smaller; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;  
            }
        }

        int lcm = (a * b) / gcd;

        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }
}
