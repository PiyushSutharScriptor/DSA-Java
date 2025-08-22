import java.util.*;

public class TaskSchedular {

    public static int leastInterval(char[] arr , int n){
        
        Map<Character,Integer> freq = new HashMap<>();
        
        for(char ch : arr){
            freq.put(ch,freq.getOrDefault(ch, 0)+1);
        }
        
        int time = 0;
        Map<Character , Integer> coold = new HashMap<>();

        while(!freq.isEmpty()){
            time++;
            char chosen=0;

            for(char task : freq.keySet()){
                if(!coold.containsKey(task) || coold.get(task)<=time){
                    chosen = task;
                    break;
                }
            }

            if(chosen!=0){
                freq.put(chosen, freq.get(chosen)-1);
                if(freq.get(chosen)==0){
                    freq.remove(chosen);
                }
                coold.put(chosen,time+n+1);
            }
        }
        return time;
    }
    public static void main(String[] args) {
        char arr[] = {'A','A','A','B','B','B'};
        int n = 2;

        System.out.println(leastInterval(arr,n));
    }
}
