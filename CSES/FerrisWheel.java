import java.util.*;

public class FerrisWheel {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int x = sc.nextInt();
      
      int[] arr = new int[n];
      for(int i=0 ; i<n ; i++){
        arr[i] = sc.nextInt();
      }
      
      Arrays.sort(arr);
      
      int l=0;
      int r=n-1;
      
      int ans = 0;
      while(l<=r){
        if(arr[l]+arr[r]<=x){
          l++;
        }
        r--;
        ans++;
      }
      
      System.out.println(ans);

      sc.close();
  }
}