public class HappyNumberSFPointers {

    public static int next(int num){

        int sum = 0;

        while(num!=0){
            int digit = num%10;
            sum += digit*digit;
            num/=10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 19;

        int slow = n;
        int fast = next(n);

        while(fast!=1 && slow!=fast){
            slow = next(slow);
            fast = next(next(fast));
        }

        if(fast==1) System.out.println(true);
        else System.out.println(false);
    }
}
