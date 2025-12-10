import java.util.*;

public class FreeTimeEmployee{
    public static void main(String[] args) {
        int[][] arr= {{1,3},{6,7},{2,4},{2,5},{9,12}};

        Arrays.sort(arr, (a,b)->Integer.compare(a[0], b[0]));

        int x = arr[0][0];
        int y = arr[0][1];

        List<int[]> li = new ArrayList<>();

        for(int i=1 ; i<arr.length ; i++){
            if(arr[i][1]<=y) continue; 
            if(arr[i][1]>y && arr[i][0]<=y){
                y = arr[i][1];
            }
            else{
                li.add(new int[]{x,y});
                x = arr[i][0];
                y = arr[i][1];
            }
        }

        li.add(new int[]{x,y});

        for(int[] ar : li){
            System.out.println(Arrays.toString(ar));
        }
        System.err.println( );

        for(int i=0 ; i<li.size()-1 ; i++){
            int[] ar = li.get(i);
            int[] ar2 = li.get(i+1);

            System.out.println(ar[1]+" "+ar2[0]);
        }

    }
}
