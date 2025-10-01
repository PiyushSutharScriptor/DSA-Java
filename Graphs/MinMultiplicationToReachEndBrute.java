import java.util.*;

class Pair{
    int node;
    int count;
    
    Pair(int node1, int count1){
        this.node = node1;
        this.count = count1;
    }
}

public class MinMultiplicationToReachEndBrute{
    public static int mod = 100000;
    
    public static int findCount(int[] arr, int s, int e){
        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(s,0));
        
        while(!que.isEmpty()){
            Pair p = que.poll();
            int nd = p.node;
            int ct = p.count;
            
            if(nd==e) return ct;
            
            for(int el : arr){
                que.add(new Pair((nd*el)%mod, ct+1));
            }
        }
        
        return -1;
    }
    
    
	public static void main(String[] args) {
	    int arr[] = {2,5,7};
	    int start = 3;
	    int end = 30;
	    
	    int res = findCount(arr,start,end);
	    System.out.println(res);
	}
}