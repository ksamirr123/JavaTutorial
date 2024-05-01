import java.util.*;

public class factorial {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int f1 = fact(n - 1);
        int f2 = n * f1;
        return f2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fact(n));
    }
}