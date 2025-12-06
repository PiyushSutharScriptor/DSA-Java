public class SortColorsBetter {
    public static void main(String[] args) {
        int[] arr = {2,1,2,0,1,2,0,1,2};

        int zero = 0;
        int one = 0;
        int two = 0;

        for(int el : arr){
            if(el==0) zero++;
            else if(el==1) one++;
            else two++;
        }

        int i=0;
        while(zero!=0){
            arr[i] = 0;
            i++;
            zero--;
        }
        while(one!=0){
            arr[i] = 1;
            i++;
            one--;
        }
        while(two!=0){
            arr[i] = 2;
            i++;
            two--;
        }

        for(int el : arr){
            System.out.print(el + " ");
        }
    }
}
