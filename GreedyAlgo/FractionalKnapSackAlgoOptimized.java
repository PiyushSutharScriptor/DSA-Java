import java.util.*;

class Pair{
    int num;
    int den;

    Pair(int num , int den){
        this.num = num;
        this.den = den;
    }
}

public class FractionalKnapSackAlgoOptimized {
    public static void main(String[] args) {
        int arr1[] = {100,60,100,200};
        int arr2[] = {20,10,50,50};
        int k = 90;

        int n = arr1.length;

        Pair[] p = new Pair[n];
        for(int i=0 ; i<n ; i++){
            p[i] = new Pair(arr1[i] , arr2[i]);
        }

        Arrays.sort(p , (p1,p2) -> {
            double r1 = (double) p1.num/p1.den;
            double r2 = (double) p2.num/p2.den;
            return Double.compare(r2,r1);
            //for descending order r2,r1 and for ascending order r1,r2
        });

        int i=0;
        double count = 0;

        while(i<n){
            if(p[i].den<=k){
                k-=p[i].den;
                count+=p[i].num;
            }
            else{
                count+=(p[i].num*k)/p[i].den; //dry run to form this formula
                break;
            }
            i++;
        }

        System.out.println(count);
        
    }
}
