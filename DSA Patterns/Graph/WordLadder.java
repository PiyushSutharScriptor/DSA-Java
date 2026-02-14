import java.util.*;

class Pair{
    public String s;
    public int l;

    Pair(String str, int len){
        this.s = str;
        this.l = len;
    }
}

public class WordLadder {

    public static int findLen(String start, String end, String[] words){
        int wl = words[0].length();

        Set<String> set = new HashSet<>();
        for(String word : words){
            set.add(word);
        }
        
        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(start, 1));
        set.remove(start);

        while(!que.isEmpty()){
            Pair p = que.poll();
            String str = p.s;
            int len = p.l;

            if(str.equals(end)) return len;

            for(int i=0 ; i<wl ; i++){
                for(char ch='a' ; ch<='z' ; ch++){

                    //string to char[]
                    char[] arr = str.toCharArray();

                    //convert the ith char with ch
                    arr[i] = ch;

                    //char[] to string
                    String newStr = new String(arr);

                    if(set.contains(newStr)){
                        que.add(new Pair(newStr, len+1));
                        set.remove(newStr);
                    }

                }
            }

        }

        return 0;

    }

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        String[] wordList = {"hot","dot","dog","lot","log","cog"};

        int res = findLen(beginWord,endWord,wordList);
        System.out.println(res);
    }
}
