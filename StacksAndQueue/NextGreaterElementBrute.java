import java.util.*;

public class NextGreaterElementBrute {
    public static void main(String[] args) {

      int arr[] = {6,0,8,1,3};
      int n = arr.length;
      
    //   o(N^2)
      for(int i=0 ; i<n-1 ; i++){
        boolean found = false;
        for(int j=i+1 ; j<n ; j++){
          if(arr[i]<arr[j]){
            arr[i]=arr[j];
            found=true;
            break;
          } 
        }
        if(!found){
          arr[i]=-1;
        }
      }
      
      arr[n-1] = -1;
      
      for(int e : arr){
        System.out.println(e);
      }
  }
}