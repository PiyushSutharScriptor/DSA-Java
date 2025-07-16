import java.util.*;
public class CombinationWithTargetPart3Optimized
{
    
    public static void generateSubset(int idx , List<List<Integer>> list, List<Integer>newAdd , int k, int n){
        if(n==0 && newAdd.size()==k){
            list.add(new ArrayList<>(newAdd));
            return;
        }
        
        if(k==0 || newAdd.size()>k) return;
        
        if(n<0) return;
        
        for(int i=idx ; i<=n ; i++){
            newAdd.add(i);
            generateSubset(i+1,list,newAdd,k,n-i);
            newAdd.remove(newAdd.size()-1);
        }
    }
    
	public static void main(String[] args) {
	    int k = 3;
	    int n = 8;
	    List<List<Integer>> list = new ArrayList<>();
        generateSubset(1,list,new ArrayList<>(),k,n);
        System.out.println(list);
	}
}