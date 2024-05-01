public class towerhanoi {
    public static void towr(int n, String scr, String help, String dest) {
        if (n == 1) {
            System.out.print("disk move from" + scr + "to" + dest);
            return;
        }
        towr(n - 1, scr, dest, help);
        System.out.print("Disk move from" + scr + "to" + dest);
        towr(n - 1, help, scr, dest);

    }

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        int n = 2;

        towr(n, "s,", "h", "d");
    }
}
