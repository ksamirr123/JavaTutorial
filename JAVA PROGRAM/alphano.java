import java.util.*;

public class alphano {
    public static void serch(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + ",");
        }
        serch(arr, key, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 2, 4, 2 };
        int key = 2;
        serch(arr, key, 0);
    }
}
