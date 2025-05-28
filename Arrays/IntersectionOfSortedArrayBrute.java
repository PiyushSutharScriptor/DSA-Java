import java.util.ArrayList;
public class IntersectionOfSortedArrayBrute {
    public static void main(String[] args){
        
        //sorted arrays
	   int arr[] = {1,2,3,4,5,6};
	   int arr2[] = {5,6,7,8,9,96,117};
	   
	   //size of arrays
	   int m = arr.length;
	   int n = arr2.length;
	   
	   ArrayList <Integer> list = new ArrayList<>();
	   int i=0;
	   int j=0;
	   
	   while (i<m && j<n){
	       if(arr[i]==arr2[j]){
	           if(list.isEmpty() || list.get(list.size()-1)!=arr[i] ){
	               list.add(arr[i]);
	           }
	           i++;
	           j++;
	       }
	       else if(arr[i]<arr2[j]){
	           i++;
	       }
	       else{
	           j++;
	       }
	   }
	   
	   System.out.print(list);
	}
}