import java.util.ArrayList;
public class ArrayListBasics {
    public static void main (String[] args){
        ArrayList<Integer> li = new ArrayList<>();

        //Add (at end)
        li.add(10);       
        li.add(20);       
        li.add(30);
        System.out.println(li);

        //add (index,element)
        li.add(3,40);
        li.add(2,100); //The previous element moved to 
                                             //next index and so on               
        System.out.println(li);

        //get (index)
        int res = li.get(0);
        System.out.println(res);
        System.out.println(li.get(1));

        //set (index,element)
        li.set(0,111);
        li.set(1,222);
        System.out.println(li);

        //remove (at index)
        li.remove(0); //111 is removed now.
        System.out.println(li);

        //size (name)
        System.out.println(li.size());

        //toString() returns a string representation
        System.out.println(li.toString());

        //clear() clears the elements in array
        li.clear();
        System.out.println(li);
    }   
}
