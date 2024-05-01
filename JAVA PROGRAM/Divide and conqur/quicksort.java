public class quicksort {
    public static void printrr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static void sorted(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pind = partition(arr, si, ei);
        sorted(arr, si, pind - 1);
        sorted(arr, pind + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    public static void main(String[] args) {

        int arr[] = { 6, 5, 9, 2, 3, 4 };
        sorted(arr, 0, arr.length - 1);
        printrr(arr);

    }

}
