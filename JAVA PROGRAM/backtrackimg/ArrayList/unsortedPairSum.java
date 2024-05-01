import java.util.*;

public class unsortedPairSum {
    public static Boolean unsort(ArrayList<Integer> list1, int target) {
        int bp = -1;
        int n = list1.size();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) > list1.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1;
        int rp = bp;
        while (lp < rp) {
            if (list1.get(lp) + list1.get(rp) == target) {
                return true;
            } else if (list1.get(lp) + list1.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(15);
        list1.add(6);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        int target = 100;
        System.out.println(unsort(list1, target));
    }
}
