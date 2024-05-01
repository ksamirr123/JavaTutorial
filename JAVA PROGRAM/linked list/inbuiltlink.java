import java.util.LinkedList;

public class inbuiltlink {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addLast(6);
        list.addLast(5);
        list.addLast(4);
        System.out.println(list);
    }
}