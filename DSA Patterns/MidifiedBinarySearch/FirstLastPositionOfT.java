public class FirstLastPositionOfT {

    public static int[] findPair(int[] arr, int t){
        boolean find1 = false;

        int first = -1;
        int last = -1;

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==t){
                if(!find1){
                    first = i;
                    find1 = true;
                }
                else{
                    last = i;
                }
            }
        }

        if(first!=-1 && last==-1) last = first;
        return new int[]{first,last};
    }

    public static void main(String[] args) {
        int[] arr = {3,3,3};
        int target = 3;

        int[] res = findPair(arr,target);
        for(int el : res){
            System.out.print(el + " ");
        }
    }
}
