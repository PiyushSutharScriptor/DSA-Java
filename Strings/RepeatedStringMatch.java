public class RepeatedStringMatch {
    public static void main(String[] args) {
        String a = "baaabbbaba";
        String b = "baaabbbababaaabbbababaaabbbababaaabbbababaaabbbababaaabbbababaaabbbababaaabbbababaaabbbababaaabbbaba";

        int m = a.length();
        int n = b.length();

        int tsize = m;
        String temp = a;

        int count=1;
        while(n>m){
            m+=tsize;
            count++;
            a+=temp;
        }

        if(a.contains(b)){
            System.out.println(count);
        }
        else{
            a+=temp;
            count++;
            if(a.contains(b)){
                System.out.println(count);
            }
            else{
                System.out.println(-1);
            }
        }

    }
}
