import java.util.*;

public class oneton {
    public static void nn(int n) {
        if (n == 1) {
            System.out.print("1");
            return;
        }
        nn(n - 1);
        System.out.print(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nn(n);
    }

}
