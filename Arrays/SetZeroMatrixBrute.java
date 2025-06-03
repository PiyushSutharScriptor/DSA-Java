import java.util.*;

public class SetZeroMatrixBrute{
    
    public static void markRow(int i, int[][] arr){
        for(int j=0 ; j<arr[i].length ; j++){
            if(arr[i][j]!=0){
                arr[i][j] = -1;
            }
        }
    }
    
    public static void markCol(int j , int[][] arr){
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i][j]!=0){
                arr[i][j] = -1;
            }
        }
    }
    
	public static void main(String[] args) {
		int arr[][] = {{1,1,1,1},{1,0,0,1},{1,1,0,1},{1,1,1,1},};
		
		for(int i=0; i<arr.length ; i++){
		    for(int j=0;j<arr[i].length ; j++){
		        System.out.print(arr[i][j] + " ");
		    }
		    System.out.println();
		}
		
        // i=row j=col
		for(int i=0 ; i<arr.length ; i++){
		    for(int j=0 ; j<arr[i].length ; j++){
		        if(arr[i][j]==0){
		            markRow(i , arr);
		            markCol(j , arr);
		        }
		    }
		}
		
		System.out.println();
		
		for(int i=0; i<arr.length ; i++){
		    for(int j=0;j<arr[i].length ; j++){
		        if(arr[i][j]==-1){
		            arr[i][j]=0;
		        }
		    }
		}
		
		for(int i=0; i<arr.length ; i++){
		    for(int j=0;j<arr[i].length ; j++){
		        System.out.print(arr[i][j] + "   ");
		    }
		    System.out.println();
		}
		
		

	}
}
