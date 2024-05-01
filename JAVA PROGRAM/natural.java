import java.util.*;

public class natural {
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        int f1 = sum(n - 1);
        int f2 = n + f1;
        return f2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sum(n));
    }
}
