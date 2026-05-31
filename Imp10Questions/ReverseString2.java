public class ReverseString2 {
    public static void main(String[] args) {
        String s = "Piyush";

        StringBuilder str = new StringBuilder(s);

        str.reverse();
        System.out.println(s);
        System.out.println(str);
    }
}
