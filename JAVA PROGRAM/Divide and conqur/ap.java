import java.sql.Struct;
import java.util.*;

public class ap {
    public static void sort(String arr[], int si, int ei) {
        if (si == ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        String arr1[] = sort(arr, si, mid);
        String arr2[] = sort(arr, mid + 1, ei);
        String arr3[] = merge(arr1, arr2);
        return arr3;
    }

    public static void merge(String arr1[], String arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        String arr4[] = new String[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (isssmall(arr1, arr2)) {
                arr4[k] = arr1[i];
                i++;
                k++;
            } else {
                arr4[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < m) {
            arr4[k++] = arr1[i++];

        }
        while (i < n) {
            arr4[k++] = arr2[j++];
        }
        return arr3;

    }

    public static

    public static void main(String[] args) {
        String arr[] = { "sun,", "apple", "banana", "cat" };
    }
}