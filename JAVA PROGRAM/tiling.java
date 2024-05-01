import java.util.*;

public class tiling {
    public static int til(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int v = til(n - 1);
        int h = til(n - 2);
        return v + h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(til(n));
    }
}