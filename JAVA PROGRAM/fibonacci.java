import java.util.*;

public class fibonacci {
    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int f1 = fibo(n - 1);
        int f2 = fibo(n - 2);
        return f1 + f2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fibo(n));
    }
}
