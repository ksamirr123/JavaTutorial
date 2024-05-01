import java.util.Stack;

public class nextgreater {
    public static void main(String[] args) {
        int arr[] = { 6, 1, 0, 8, 3 };
        Stack<Integer> s = new Stack<>();
        int nxrgrtelement[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nxrgrtelement[i]= - 1;
            } else {
                nxrgrtelement[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for (int i = 0; i < nxrgrtelement.length; i++) {
            System.out.print(nxrgrtelement[i] + " ");
        }
        System.out.println();
    }
}
