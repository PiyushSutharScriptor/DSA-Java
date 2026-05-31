public class FindEleOfFibonacciSeries {
    public static void main(String[] args) {
        int el = 6;

        int a = 0;
        int b = 1;
        int c = 0;

        if(el==1){
            System.out.println(a);
        }
        else if(el==2){
            System.err.println(b);
        }
        else{
            for(int i=3 ; i<=el ; i++){
                c = a+b;
                a = b;
                b = c;
            }
            System.out.println(c);
        }
    }
}
