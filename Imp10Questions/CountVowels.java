public class CountVowels {
    public static void main(String[] args) {
        String str = "aeiouaeiou";

        int count = 0;

        for(char ch : str.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }

        System.out.println(count);
    }
}
