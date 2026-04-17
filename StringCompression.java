import java.util.*;

class StringCompression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String result = "";
        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                result = result + s.charAt(i) + count;
                count = 1; 
            }
        }
        
        result = result + s.charAt(s.length() - 1) + count;

        System.out.println("Compressed string: " + result);
    }
}
