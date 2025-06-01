import java.util.*;

public class ReArrangeElementsBySignBrut{
	public static void main(String[] args) {
	    int arr[] = {3,1,-2,-5,2,-4};
	    int n = arr.length;
	    
	    ArrayList<Integer> pos = new ArrayList<>();
	    ArrayList<Integer> neg = new ArrayList<>();
	    
	    for(int i=0;i<n;i++){
	        if(arr[i]<0){
	            neg.add(arr[i]);
	        }
	        else{
	            pos.add(arr[i]);
	        }
	    }
	    
	    int negcount = 0;
	    int poscount = 0;
	    for(int i=0 ; i<n ; i++){
	        if(i%2==0){
	            arr[i] = pos.get(poscount);
	            poscount++;
	        }
	        else{
	            arr[i] = neg.get(negcount);
	            negcount++;
	        }
	    }
	    
	    for(int num : arr){
	        System.out.println(num);
	    }
	}
}