import java.util.*;

class Pair{
    String str;
    List<String> li;

    Pair(String str1, List<String> li1){
        this.str = str1;
        this.li = new ArrayList<>(li1);
    }
}
class cPair{
    String str;
    int len;
    cPair(String str2, int len1){
        this.str = str2;
        this.len = len1;
    }
}
public class WordLadderTwoUsingBFSAndSetOptimized {

    public static List<List<String>> findSequence(List<String> ori, String start, String end){

        Set<String> set = new HashSet<>(ori);

        Map<String, Integer> map = new HashMap<>();
        Queue<cPair> q = new LinkedList<>();

        map.put(start,0);
        q.add(new cPair(start,0));

        while(!q.isEmpty()){
            cPair p = q.poll();
            String word = p.str;
            int len = p.len;

            if(word.equals(end)) break;

            for(int i=0 ; i<word.length() ; i++){
                for(char ch='a' ; ch<='z' ; ch++){
                    char[] charArray = word.toCharArray();
                    charArray[i] = ch;

                    String str = new String(charArray);

                    if(set.contains(str)){
                        map.put(str,len+1);
                        set.remove(str);
                        q.add(new cPair(str, len+1));
                    }
                }
            }
        }

        //Part : 2
        Queue<Pair> que = new LinkedList<>();
        List<List<String>> res = new ArrayList<>();

        que.add(new Pair(start, new ArrayList<>(Arrays.asList(start))));

        while(!que.isEmpty()){
            Pair p = que.poll();
            String word = p.str;
            List<String> li = p.li;

            if(word.equals(end)){
                res.add(li);
            }

            for(int i=0 ; i<word.length() ; i++){
                for(char ch='a' ; ch<='z' ; ch++){
                    char[] charArray = word.toCharArray();
                    charArray[i] = ch;

                    String str = new String(charArray);

                    if(map.containsKey(str) && map.get(str)==map.get(word)+1){
                        List<String> newList = new ArrayList<>(li);
                        newList.add(str);
                        que.add(new Pair(str, newList));
                    }
                }
            }
        }

        return res;

    }
    public static void main(String[] args) {
        String arr[]  = {"hot","dot","dog","lot","log","cog"};
        String start = "hit";
        String end = "cog";

        List<String> wordList = new ArrayList<>();

        for(String s : arr){
            wordList.add(s);
        }

        List<List<String>> res = findSequence(wordList,start,end);

        System.out.println(res);

        /*
            ["hit","hot","dot","dog","cog"],
            ["hit","hot","lot","log","cog"] 
        */
    }
}


