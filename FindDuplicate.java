import java.util.*;

class FindDuplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int duplicate = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = arr[i];
                    break;
                }
            }
            if (duplicate != -1) {
                break;
            }
        }

        if (duplicate != -1) {
            System.out.println("Duplicate element: " + duplicate);
        } else {
            System.out.println("No duplicate found");
        }
    }
}
