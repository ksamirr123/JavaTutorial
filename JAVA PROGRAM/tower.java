
//tower of hanoi//
import java.util.*;

public class tower {
    public static void tow(int n, String src, String help, String dest) {
        if (n == 1) {
            System.out.println("disk move from" + src + "to" + dest);
            return;
        }
        tow(n - 1, src, dest, help);
        System.out.println("disk move from" + src + "to" + dest);
        tow(n - 1, help, src, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tow(n, "s", "h", "d");
    }

}