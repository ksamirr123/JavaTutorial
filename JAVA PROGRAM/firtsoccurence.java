import java.util.*;

public class firtsoccurence {
    public static int occ(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return occ(arr, key, i + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 4 };
        int key = 4;
        System.out.print(occ(arr, key, 0));
    }
}
