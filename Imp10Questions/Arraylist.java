import java.util.*;

public class Arraylist {
    public static void main(String[] args) {

        int[] arr = {11,23,45,6,7,89};

        List<Integer> li = new ArrayList<>();

        for(int el : arr){
            li.add(el);
        }

        System.out.println(li);
        System.out.println(li.isEmpty());
        System.out.println(li.size());
        System.out.println(li.indexOf(4));
        li.remove(4);
        System.out.println(li);
        li.set(1,999);
        System.out.println(li);
        li.get(1);
        Collections.sort(li);
        System.out.println(li);
        System.out.println(li.size());
    }
}
