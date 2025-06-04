import java.util.*;

public class RotateMatrixBy90DBrute{
    
	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},};
		int r = arr.length;
		int c = arr[0].length;
		
		int ans[][] = new int[r][c];
		
		for(int i=0 ; i<r ; i++){
		    for(int j=0 ; j<c ; j++){
		        ans[j][(c-1)-i] = arr[i][j];
		    }
		}
		
		for(int i=0 ; i<r ; i++){
		    for(int j=0 ; j<c ; j++){
		        System.out.print(ans[i][j] + "  ");
		    }
		    System.out.println();
		}
		
		
	}
}
