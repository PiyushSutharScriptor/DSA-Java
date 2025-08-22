import java.util.*;

public class MedianOfRunningStreams {

    PriorityQueue <Integer> max = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue <Integer> min = new PriorityQueue<>();

    MedianOfRunningStreams(){
        max = new PriorityQueue<>(Collections.reverseOrder()); 
        min = new PriorityQueue<>();
    }

    public void add(int num){
        if(max.isEmpty() || max.peek()>=num){
            max.add(num);
        }
        else{
            min.add(num);
        }

        if(max.size()>min.size()+1) {
            min.add(max.poll());
        }
        else if(min.size()>max.size()){
            max.add(min.poll());
        }
    }   

    public double median(){
        if(max.size()==min.size()){
            return (max.peek()+min.peek())/2.0;
        }
        return max.peek();
    }
    public static void main(String[] args) {
        MedianOfRunningStreams m1 = new MedianOfRunningStreams();

        m1.add(3);
        System.out.println(m1.median());
        m1.add(1);
        System.out.println(m1.median());
        m1.add(5);
        System.out.println(m1.median());
        m1.add(4);
        System.out.println(m1.median());
    }
}
