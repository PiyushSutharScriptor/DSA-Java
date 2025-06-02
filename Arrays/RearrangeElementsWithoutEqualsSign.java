 import java.util.*;

public class RearrangeElementsWithoutEqualsSign
{
	public static void main(String[] args) {
	    int arr[] = {3,1,-2,-5,2,-4,5,5,5,5,5};
	    int n = arr.length;
	    
	    ArrayList <Integer> pos = new ArrayList <>();
	    ArrayList <Integer> neg = new ArrayList <>();
	    
	    for(int i=0 ; i<n ; i++){
	        if(arr[i]<0){
	            neg.add(arr[i]);
	        }
	        else{
	            pos.add(arr[i]);
	        }
	    }
	    
	    int i=0;
	    int poscount = 0;
	    int negcount = 0;
	    
	    while (poscount<pos.size() && negcount<neg.size()){
	        arr[i] = pos.get(poscount);
	        i++;
	        poscount++;
	        
	        arr[i] = neg.get(negcount);
	        i++;
	        negcount++;
	    }
	    
	    while(poscount<pos.size()){
	        arr[i++] = pos.get(poscount++);
	    }
	    
	    while(negcount<neg.size()){
	        arr[i++] = neg.get(negcount++);
	    }
	    
	    for(int num : arr){
	        System.out.print(num + " ");
	    }
	    
	}
}