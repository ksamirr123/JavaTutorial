import java.util.Collections;
import java.util.ArrayList;

public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(9);
        list1.add(1);
        list1.add(10);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        Collections.sort(list1, Collections.reverseOrder());
        System.out.print(list1);
    }
}