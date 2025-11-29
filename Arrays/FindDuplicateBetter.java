public class FindDuplicateBetter {

    public static int findDup(int[] arr){
        int n = arr.length;

        int[] arr2 = new int[n+1];

        for(int i=0 ; i<n ; i++){
            arr2[arr[i]]++;
            if(arr2[arr[i]] == 2) return arr[i];
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};

        int res = findDup(arr);
        System.out.println(res);
    }    
}
