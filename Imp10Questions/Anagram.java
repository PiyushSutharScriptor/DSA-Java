import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String a = "silent";
        String b = "listen";

        char[]arr = a.toCharArray();
        char[]brr = b.toCharArray();

        for(char el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
        for(char el : brr){
            System.out.print(el + " ");
        }
        System.out.println();
        
        Arrays.sort(arr);
        Arrays.sort(brr);

        for(char el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
        for(char el : brr){
            System.out.print(el + " ");
        }
        System.out.println();

        if(Arrays.equals(arr, brr)){
            System.out.println("Valid Anagram");
        }
        else{
            System.out.println("Invalid Anagram");
        }

    }
}
