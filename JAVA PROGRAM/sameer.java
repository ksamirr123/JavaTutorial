import java.util.*;

public class sameer {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int f1 = power(x, n - 1);
        int f2 = x * f1;
        return f2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.print(power(x, n));
    }
}