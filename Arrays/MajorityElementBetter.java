import  java.util.*;

public class MajorityElementBetter
{
	public static void main(String[] args) {
		int arr[] = {2,2,3,3,1,2,2};
		int n = arr.length;
		
		boolean found = false;
		
		HashMap <Integer, Integer> map = new HashMap<>();
		
		for(int i=0 ; i<n ; i++){
		    map.put(arr[i] , map.getOrDefault(arr[i] , 0) +1);
		}
		
		System.out.println(map);

        
        for(Integer key : map.keySet()){
            int value = map.get(key);
            if(value > n/2){
                System.out.print("The majority element : " + key);
                found = true;
                break;
            }
        }
        
        if(!found){
            System.out.print("No majority element found");
        }
	}
}