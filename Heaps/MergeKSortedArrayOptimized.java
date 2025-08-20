import java.util.*;

class Node{
  public int data;
  public int i,j;
  
  Node(int data, int row, int col){
    this.i = row;
    this.j = col;
    this.data = data;
  }
}

public class MergeKSortedArrayOptimized {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      List<Integer> li = new ArrayList<>();
      
      int t = sc.nextInt();
      sc.nextLine();
      
      while(t!=0){
        int n = sc.nextInt();
        
        //inserting all the elements of array 
        List<int[]> kArray = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
          
          int size = sc.nextInt();
          int arr[] = new int[size];
          
          for(int j=0 ; j<size ; j++){
            arr[j] = sc.nextInt();
          }
          
          kArray.add(arr);
        }
        
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data - b.data);
        
        // Step 1 : insert first element of every array 
        for(int i=0 ; i<n ; i++) {
          Node n1 = new Node(kArray.get(i)[0] , i , 0);
          pq.add(n1);
        }
        
        // Step 2 : 
        while(!pq.isEmpty()){
          Node temp = pq.poll();
          li.add(temp.data);
          
          int i = temp.i;
          int j = temp.j;
          
          if(j+1 < kArray.get(i).length){
            Node next = new Node(kArray.get(i)[j+1] , i , j+1);
            pq.add(next);
          }
        }
        
        t--; 
      }
      
      System.out.println(li);
      
      /*
        Take the below input : 
        
        1
        2
        3 
        3 5 9 
        4 
        1 2 3 8 
      */
  }
}