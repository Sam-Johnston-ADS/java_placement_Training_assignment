import java.util.*;

class MoveZerosToEnd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];
        int pos = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                result[pos] = arr[i];
                pos++;
            }
        }

        System.out.print("Array after moving zeros: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
