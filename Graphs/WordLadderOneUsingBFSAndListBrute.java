import java.util.*;

class Pair{
    String str;
    int len;

    Pair(String str1, int len1){
        this.str = str1;
        this.len = len1;
    }
}
public class WordLadderOneUsingBFSAndListBrute {

    public static int findCount(List<String> wordList, String start, String end){

        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(start, 1));

        wordList.remove(start);

        while(!que.isEmpty()){
            Pair p = que.poll();
            String word = p.str;
            int len = p.len;

            // when reaches the target
            if(word.equals(end)==true) return len;

            for(int i=0 ; i<word.length() ; i++){
                for(char ch='a' ; ch<='z' ; ch++){
                    char[] charArray = word.toCharArray();
                    charArray[i] = ch;

                    String str = new String(charArray);

                    if(wordList.contains(str)==true){
                        wordList.remove(str);
                        que.add(new Pair(str, len+1));
                    }
                }
            }

        }

        return 0;
    }
    public static void main(String[] args) {
        String[] arr = {"hot","dot","dog","lot","log","cog"};
        String start= "hit";
        String end = "cog";

        List<String> wordList = new ArrayList<>();

        for(String s : arr){
            wordList.add(s);
        }

        System.out.println(findCount(wordList,start,end));

    }
}
