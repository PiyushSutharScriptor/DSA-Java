import java.util.*;

public class UpperBoundList {

    public static int upperBound(List<Integer>li, int x){

        int n = li.size();
        int l = 0;
        int r = n-1;
        int ans = n;

        while(l<=r){
            int mid = l+(r-l)/2;

            if(li.get(mid)>x){
                ans = mid;
                r = mid-1;
            }
            else l=mid+1;
        }

        return ans;
    }

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(4);
        li.add(2);
        li.add(3);

        Collections.sort(li);

        int x = 3;
        int res = upperBound(li,x);
        System.out.println(li.get(res));
    }
}
