
// PROGRAM TO FIND REMAINDER IN JAVA//
import java.util.*;

public class remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENETER THE VALUE OF N:");
        int n = sc.nextInt();
        int rem = n % 10;
        System.out.print("Remainder = " + rem);
    }
}