
public class search {
    public static int src(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == tar) {
            return mid;
        }
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= tar && tar <= arr[mid]) {
                return src(arr, tar, si, mid - 1);
            } else {
                return src(arr, tar, mid + 1, ei);
            }
        } else {
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return src(arr, tar, mid + 1, ei);

            } else {
                return src(arr, tar, si, mid - 1);
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 3, 9, 1, 2, 0 };
        int tar = 0;
        int ind = src(arr, tar, 0, arr.length - 1);
        System.out.print("target present at=" + ind);
        System.out.print(ind);
    }
}