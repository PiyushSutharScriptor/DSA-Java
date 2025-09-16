import java.util.*;

public class DirectedGraphRepresentArrayList {
    public static void main(String[] args) {

        int n = 3;
        int m = 3;

        List<List<Integer>> li = new ArrayList<>();

        for(int i=0 ; i<=n ; i++){
            li.add(new ArrayList<>());
        }

        //1-->2
        li.get(1).add(2);
        
        //2-->3
        li.get(2).add(3);
        
        //1-->3
        li.get(1).add(3);
        
        System.out.println(li);
    }
}
