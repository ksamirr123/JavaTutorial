import java.util.ArrayList;

public class SyntaxArraylist {
  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.add(4);
    System.out.println(list1);
    int index = list1.get(2);
    System.out.println(index);
    list1.remove(1);
    System.out.println(list1);
    list1.set(2, 10);
    System.out.println(list1);
    System.out.println(list1.contains(2));
  }
}
