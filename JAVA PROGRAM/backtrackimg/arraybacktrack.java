
public class arraybacktrack {
    public static void chngearr(int arr[], int i, int val) {
        if (i == arr.length) {
            printrr(arr);
            return;
        }
        arr[i] = val;
        chngearr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }

    public static void printrr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        chngearr(arr, 0, 1);
        printrr(arr);

    }
}