import java.util.*;

public class RotateMatrix90DegOptimized{
    
	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},};
		int r = arr.length;
		int c = arr[0].length;
		
		for(int i=0 ; i<r-1; i++){
		    for(int j=i+1; j<c ; j++){
		        int temp = arr[i][j];
		        arr[i][j] = arr[j][i];
		        arr[j][i] = temp;
		    }
		}
		
		for(int i=0 ; i<c ; i++){
		    int start = 0;
		    int end = r-1;
		    
		    while(start<end){
		        int temp = arr[i][start];
		        arr[i][start] = arr[i][end];
		        arr[i][end] = temp;
		        start++;
		        end--;
		    }
		}
		
		
		for(int i=0 ; i<r ; i++){
		    for(int j=0 ; j<c ; j++){
		        System.out.print(arr[i][j] + "  ");
		    }
		    System.out.println();
		}
		
		
	}
}
