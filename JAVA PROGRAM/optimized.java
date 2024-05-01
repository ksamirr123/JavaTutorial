import java.util.*;

public class optimized {
    public static int opti(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            int f1 = opti(x, n / 2);
            int f2 = f1 * f1;
        } else {
            int f2 = x * f1 * f1;
        }
        return f2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.print(opti(x, n));
    }

}
