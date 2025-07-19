import java.util.*;
public class RateInMazeOptimized
{
    
    public static void findCombination(int x, int y, int[][] arr, List<String> res, boolean[][] visited , int n, String newAdd){
        
        //out of bound, visited and border cases
        if(x<0 || y<0 || x>=n || y>=n || arr[x][y]==0 || visited[x][y]) return;
        
        //base case
        if(x==n-1 && y==n-1){
            res.add(newAdd);
            return;
        }
        
        visited[x][y] = true;
        
        //Down
        findCombination(x+1,y,arr,res,visited,n,newAdd+"D");
        //Right
        findCombination(x,y+1,arr,res,visited,n,newAdd+"R");
        //Left
        findCombination(x,y-1,arr,res,visited,n,newAdd+"L");
        //Up
        findCombination(x-1,y,arr,res,visited,n,newAdd+"U");
        
        visited[x][y] = false;
        
    }
    
	public static void main(String[] args) {
		int[][] arr = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
		int n = 4;
		
		List<String> res = new ArrayList<>();
		
		boolean [][]visited = new boolean[n][n];
		
		if(arr[0][0]==1){
		    findCombination(0, 0, arr,res,visited,n,"");
		}
		System.out.println(res);
	
	}
}