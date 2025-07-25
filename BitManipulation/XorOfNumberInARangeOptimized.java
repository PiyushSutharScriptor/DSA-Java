public class XorOfNumberInARangeOptimized {
    public static int findXor(int n){
        if(n%4==1){
            return 1;
        }
        else if(n%4==2){
            return n+1;
        }
        else if(n%4==3){
            return 0;
        }   
        else{
            return n;
        }
    }
    public static void main(String[] args) {
        int n = 7;

        System.out.println(findXor(n));
    }
}
