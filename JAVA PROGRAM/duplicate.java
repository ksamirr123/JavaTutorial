import java.util.*;

public class duplicate {
    public static int index(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i);
        }
        index(arr, key, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 2, 2, 5 };
        int key = 2;
        System.out.print(index(arr, key, 0));
    }
}