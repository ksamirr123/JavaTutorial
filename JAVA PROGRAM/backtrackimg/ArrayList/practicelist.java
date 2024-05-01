import java.util.*;

public class practicelist {
    public static boolean sun(ArrayList<Integer> list1) {
        for (int i = 0; i < list1.size(); i++) {
            for (int j = i + 1; j < list1.size(); j++) {
                if (list1.get(i) == list1.get(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(4);
        list1.add(3);
        list1.add(5);
        System.out.println(sun(list1));

    }
}
