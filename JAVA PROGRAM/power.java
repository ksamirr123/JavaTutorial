import java.util.*;

public class power {
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int f1 = pow(x, n - 1);
        int f2 = x * f1;
        return f2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.print(pow(x, n));
    }

}
