import java.util.*;
public class ArrayListInitialization{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30));

        list.add(10);
        list.add(4,99);
        
        System.out.println(list);

        //end
    }
}