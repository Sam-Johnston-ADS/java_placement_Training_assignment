import java.util.*;

class LongestSubstringNoRepeat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            String currentSubstring = "";

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);

                boolean alreadyExists = false;
                for (int k = 0; k < currentSubstring.length(); k++) {
                    if (currentSubstring.charAt(k) == ch) {
                        alreadyExists = true;
                        break;
                    }
                }

                if (alreadyExists) {
                    break;  
                }

                currentSubstring = currentSubstring + ch;

                if (currentSubstring.length() > maxLength) {
                    maxLength = currentSubstring.length();
                }
            }
        }

        System.out.println("Length of longest substring: " + maxLength);
    }
}
