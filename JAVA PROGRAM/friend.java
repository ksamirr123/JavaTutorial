import java.util.Scanner;

public class friend {
    public static int pairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return pairs(n - 1) + (n - 1) * pairs(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(pairs(n));

    }

}
