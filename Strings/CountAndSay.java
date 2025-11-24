public class CountAndSay{

    public static String cas(int n){
        if(n==1) return "1";

        String number = "1";

        for(int i=2 ; i<=n ; i++){

            int count = 1;
            String res = "";
            char curr = number.charAt(0);

            for(int j=1 ; j<number.length() ; j++){
                if(number.charAt(j)==curr) count++;
                else{
                    res += Integer.toString(count)+curr;
                    curr = number.charAt(j);
                    count=1;
                }
            }

            res += Integer.toString(count)+curr;
            number = res;
        }

        return number;
    }

    public static void main(String[] args) {
        int n = 4;
        String res = cas(n);
        System.out.println(res);
    }
}
