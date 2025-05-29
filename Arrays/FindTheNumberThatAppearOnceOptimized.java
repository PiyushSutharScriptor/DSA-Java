import  java.util.*;
public class FindTheNumberThatAppearOnceOptimized{
    public static void main (String args[]){
        int arr[] = {1,1,2,2,3,4,4,5,5};
        int n = arr.length;

        HashMap <Integer, Integer> map = new HashMap <>();

        for(int num:arr){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }
        
        for(int num : arr){
            if(map.get(num) == 1){
                System.out.println("The number is : " + num);
            }
        }

    }
}