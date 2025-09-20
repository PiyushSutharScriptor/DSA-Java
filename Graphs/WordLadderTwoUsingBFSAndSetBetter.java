import java.util.*;

public class WordLadderTwoUsingBFSAndSetBetter{

    public static List<List<String>> findSequence(List<String> original, String start, String end){

        Set<String> set = new HashSet<>();

        for(String s : original){
            set.add(s);
        }

        Queue<List<String>> que = new LinkedList<>();
        que.add(new ArrayList<>(Arrays.asList(start)));

        List<String> usedStr = new ArrayList<>();
        usedStr.add(start);

        int lvl = 0;

        List<List<String>> res = new ArrayList<>();

        while(!que.isEmpty()){
            List<String> li = que.poll();

            //removing from set : 
            if(li.size()>lvl){
                lvl++;
                for(String s : li){
                    set.remove(s);
                }
            }

            String word = li.get(li.size()-1);

            if(word.equals(end)){
                if(res.size()==0){
                    res.add(li);
                }
                else if(res.get(0).size()==li.size()){
                    res.add(li);
                }
            }

            for(int i=0 ; i<word.length() ; i++){                
                for(char ch='a' ; ch<='z' ; ch++){
                    char[] charArray = word.toCharArray();
                    charArray[i] =  ch;
                    String str = new String(charArray);

                    if(set.contains(str)){
                        li.add(str);

                        List<String> newList = new ArrayList<>(li);
                        que.add(newList);

                        usedStr.add(str);
                        li.remove(li.size()-1);
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
 