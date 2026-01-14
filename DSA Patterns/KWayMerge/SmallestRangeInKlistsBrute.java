import java.util.*;

public class SmallestRangeInKlistsBrute {

    public static boolean findOne (int[][] arr , int a, int b){
        for(int i=0 ; i<arr.length ; i++){
            boolean flag = false;
            for(int j=0 ; j<arr[i].length ; j++){
                if(arr[i][j]>=a && arr[i][j]<=b){
                    flag = true;
                    break;
                }
            }
            if(!flag) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] arr = {{4,10,15,24,26},{0,9,12,20},{5,18,22,30}};

        int m = arr.length;

        List<Integer> arrEle = new ArrayList<>();
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<arr[i].length ; j++){   
                arrEle.add(arr[i][j]);
            }
        }

        Collections.sort(arrEle);

        List<int[]> li = new ArrayList<>();
        int elSize = arrEle.size();
        for(int i=0 ; i<elSize ; i++){
            for(int j=i+1 ; j<elSize ; j++){
                li.add(new int[]{arrEle.get(i),arrEle.get(j)});
            }
        }

        int min = Integer.MAX_VALUE;
        int a = 0;
        int b = 0;

        for(int[] ar : li){
            int el1 = ar[0];
            int el2 = ar[1];
            boolean res = findOne(arr, el1, el2);
            if(res && (el2-el1)<min){
                min = el2-el1;
                a = el1;
                b = el2;
            }
        }

        System.out.println(a + " " + b);
    }    
}
