//import java.util.*;

public class pactice {
    public static int srch(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == tar) {
            return mid;
        }
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= tar && tar <= arr[mid]) {
                return srch(arr, tar, si, mid - 1);
            } else {
                return srch(arr, tar, mid + 1, ei);
            }
        } else {
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return srch(arr, tar, mid + 1, ei);
            } else {
                return srch(arr, tar, si, mid - 1);

            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 2, 0, 1 };
        int tar = 0;
        int pind = srch(arr, tar, 0, arr.length - 1);
        System.out.print(pind);

    }
}
