import java.util.*;

public class stringmergesort {
    public static String mg(String arr[], int si, int ei) {
        if (si == ei) {
            String a[] = { arr[si] };
            return a;
        }
        int mid = si + (ei - si) / 2;
        String arr1 = mg(arr, si, mid);
        String arr2 = mg(arr, mid + 1, ei);
        String arr3 = merge(arr1, aar2);
        return arr3;
    }

    public static String merge(String arr1[], String arr2[]) {
        int m = arr1.length;
        int n = arr2.length;

    }

    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
    }
}
