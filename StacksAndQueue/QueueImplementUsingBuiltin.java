import java.util.*;

public class QueueImplementUsingBuiltin {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();

        //add/push
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);

        System.out.println(que);

        //peek/top
        System.out.println(que.peek());

        //remove
        que.remove();

        System.out.println(que);

        //size
        System.out.println(que.size());

        // empty
        System.out.println(que.isEmpty());

    }
}
