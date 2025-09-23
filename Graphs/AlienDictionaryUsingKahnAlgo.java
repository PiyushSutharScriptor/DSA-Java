import java.util.*;

public class AlienDictionaryUsingKahnAlgo {

    public static String findOrder(String[] dict , int k){
        int n = dict.length;
        List<char[]> li = new ArrayList<>();

        for(int i=1 ; i<n ; i++){
            findSeq(dict[i],dict[i-1],li);
        }

        List<List<Integer>> adj = new ArrayList<>();
        int[] degarr = new int[k];

        for(int i=0 ; i<k ; i++){
            adj.add(new ArrayList<>());
        }

        for(char[] edge : li){
            int u = edge[0]-'a';
            int v = edge[1]-'a';

            adj.get(u).add(v);
            degarr[v]++;
        }

        Queue<Integer> que = new LinkedList<>();

        for(int i=0 ; i<k ; i++){
            if(degarr[i]==0) que.add(i);
        }

        StringBuilder res = new StringBuilder();
        while(!que.isEmpty()){
            int node = que.poll();
            res.append((char)(node+'a'));

            for(int el : adj.get(node)){
                degarr[el]--;
                if(degarr[el]==0) que.add(el);
            }
        }

        return res.toString();

    }

    public static void findSeq(String s1, String s2, List<char[]> li){
        int m = s1.length();
        int n = s2.length();

        int i=0;
        while(i<m && i<n){
            char a = s1.charAt(i);
            char b = s2.charAt(i);

            if(a!=b){
                li.add(new char[]{b,a});
                break;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        String dict[] = {"baa","abcd","abca","cab","cad"};
        int k=4;

        String res = findOrder(dict,k);

        System.out.println(res);
    }
}
