import java.util.*;

class ReverseInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int rev = 0;
        int temp = num;

        while (temp != 0) {
            int lastDigit = temp % 10;   
            rev = rev * 10 + lastDigit;  
            temp = temp / 10;            
        }

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            System.out.println("Overflow! Result: 0");
        } else {
            System.out.println("Reversed number: " + rev);
        }
    }
}
