public class DivideTwoIntegersBrute {
    public static void main(String[] args) {
        int dividend = 22;
        int divisor = 3;

        int sum = 0;
        int count = 0;

        while(sum+divisor<=dividend){
            count++;
            sum+=divisor;
        }

        System.out.println(count);
    }
}
