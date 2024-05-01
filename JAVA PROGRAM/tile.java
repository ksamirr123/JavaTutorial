import java.util.*;

public class tile {
    public static int way(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int f1 = way(n - 1);
        int f2 = way(n - 2);
        return f1 + f2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("total ways:");
        System.out.print(way(n));
    }

}
