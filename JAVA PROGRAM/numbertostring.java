import java.util.*;

public class numbertostring {
    static String digit[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void print1(int n) {
        if (n == 0) {
            return;
        }
        int last = n % 10;
        print1(n / 10);
        System.out.print(digit[last] + "");
    }

    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        int n = sv.nextInt();
        print1(n);
    }
}
