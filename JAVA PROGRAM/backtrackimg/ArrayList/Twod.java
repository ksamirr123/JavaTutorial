import java.util.*;

public class Twod {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist1 = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(5);
        list1.add(3);
        list1.add(9);
        list1.add(8);
        mainlist1.add(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(5);
        list2.add(3);
        list2.add(9);
        list2.add(8);
        mainlist1.add(list2);
        System.out.println(mainlist1);
        for (int i = 0; i < mainlist1.size(); i++) {
            ArrayList<Integer> currlist = mainlist1.get(i);
            for (int j = 0; j < currlist.size(); j++) {
                System.out.print(currlist.get(j));
            }
            System.out.println();

        }

    }
}