public class gridways {
    public static int countways(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        if (i == n || j == m) {
            return 0;
        }
        int w1 = countways(i + 1, j, n, m); // for right ways
        int w2 = countways(i, j + 1, n, m); // for left ways
        return w1 + w2;

    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int s = countways(0, 0, n, m);
        System.out.println(s);
    }
}