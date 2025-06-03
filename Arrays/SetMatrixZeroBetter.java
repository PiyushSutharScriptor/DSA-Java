import java.util.*;

public class SetMatrixZeroBetter{
    
	public static void main(String[] args) {
		int arr[][] = {{1,1,1,1},{1,0,0,1},{1,1,0,1},{1,1,1,1},};
		int r = arr.length;
		int c = arr[0].length;
		
		for(int i=0; i<arr.length ; i++){
		    for(int j=0;j<arr[i].length ; j++){
		        System.out.print(arr[i][j] + " ");
		    }
		    System.out.println();
		}
		
		
		//logic here
		int row[] = new int[r];
		int col[] = new int[c];
		
		for(int i=0 ; i<r ; i++){
		    for(int j=0 ; j<c ; j++){
		        if(arr[i][j]==0){
		            row[i] = 1;
		            col[j] = 1;
		        }
		    }
		}
		
		System.out.println();
		
	    for(int i=0 ; i<r ; i++){
		    for(int j=0 ; j<c ; j++){
		        if(row[i]==1 || col[j]==1){
		            arr[i][j] = 0;
		        }
		    }
		}
		
		for(int i=0; i<arr.length ; i++){
		    for(int j=0;j<arr[i].length ; j++){
		        System.out.print(arr[i][j] + " ");
		    }
		    System.out.println();
		}
		
	}
}
