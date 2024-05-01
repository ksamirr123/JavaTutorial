public class lastocc {
    public static int last(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = last(arr, key, i + 1);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2 };
        int key = 2;
        System.out.print(last(arr, key, 0));
    }
}
