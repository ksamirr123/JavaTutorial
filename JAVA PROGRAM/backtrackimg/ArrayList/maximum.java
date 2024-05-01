import java.util.ArrayList;

public class maximum {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(1);
        list1.add(4);
        list1.add(9);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list1.size(); i++) {
            if (max < list1.get(i)) {
                max = list1.get(i);
            }
        }
        System.out.println("max element  = " + max);
    }
}