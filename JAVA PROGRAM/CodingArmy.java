import java.util.*;

//src=source=S, help= helper=H , dest=destination=D
public class CodingArmy {
    public static void tower(int n, String src, String help, String dest) {
        if (n == 1) {
            System.out.println("disk move from " + src + "to" + dest);
            return;
        }
        tower(n - 1, src, dest, help);
        System.out.println("disk move from" + src + "to" + dest);
        tower(n - 1, help, src, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tower(n, "S", "H", "D");
    }
}