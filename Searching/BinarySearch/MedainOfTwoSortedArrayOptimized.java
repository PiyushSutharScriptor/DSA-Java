public class MedainOfTwoSortedArrayOptimized
{
	public static void main(String[] args) {
	    int arr1[] = {1,3};
		int arr2[] = {2,3,6,15};
		
		int m = arr1.length;
		int n = arr2.length;
		
		int i = 0;
		int j = 0;
		
		int a = (m+n)/2;
		int b = a-1;
		
		int ael = -1;
		int bel = -1;
		
		int count = 0;
		
		while(i<m && j<n){
		    if(arr1[i]<arr2[j]){
		        if(count == a) ael = arr1[i];
		        if(count == b) bel = arr1[i];
		        count++;
		        i++;
		    }
		    else{
		        if(count == a) ael = arr2[j];
		        if(count == b) bel = arr2[j];
		        count++;
		        j++;
		    }
		}
		
		while(i<m){
		    if(count == a) ael = arr1[i];
	        if(count == b) bel = arr1[i];
	        count++;
	        i++;
		}
		while(j<n){
		    if(count == a) ael = arr2[j];
	        if(count == b) bel = arr2[j];
	        count++;
	        j++;
		}
		
        //first mid element 
		System.out.println(ael);
		System.out.println(bel);
		
		if ((m + n) % 2 == 0) {
            System.out.println("Median: " + (ael + bel) / 2.0);
        } else {
            System.out.println("Median: " + ael);
        }
	}
}