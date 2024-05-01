
//CONTAINER OF MOST WATER
import java.util.*;

public class mostwater {
    public static int cont(ArrayList<Integer> hight) {
        int maxwater = 0;
        for (int i = 0; i < hight.size(); i++) {
            for (int j = i + 1; j < hight.size(); j++) {
                int h = Math.min(hight.get(i), hight.get(j));
                int w = j - i;
                int currwater = h * w;
                maxwater = Math.max(maxwater, currwater);
            }
        }
        return maxwater;

    }

    public static void main(String[] args) {
        ArrayList<Integer> hight = new ArrayList<>();
        hight.add(1);
        hight.add(8);
        hight.add(6);
        hight.add(2);
        hight.add(5);
        hight.add(4);
        hight.add(8);
        hight.add(3);
        hight.add(7);
        System.out.println(hight);
        int s = cont(hight);
        System.out.print(s);
    }
}
