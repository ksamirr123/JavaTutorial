import java.util.*;

public class reversestack {
    public static void pushbottom(Stack<Integer> s, int data) {
        int top = s.pop();
        pushbottom(s, data);
        s.push(top);
    }

    public static void recstk(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        recstk(s);
        pushbottom(s, top);
    }

    public static void printstack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        recstk(s);
        printstack(s);

    }
}
