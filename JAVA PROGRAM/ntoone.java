import java.util.*;

public class ntoone {
    public static void rev(int n) {
        if (n == 1) {
            System.out.print("1");
            return;
        }
        System.out.print(n);
        rev(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rev(n);
    }

}
