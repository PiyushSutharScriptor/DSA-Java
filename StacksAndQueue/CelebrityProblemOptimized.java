public class CelebrityProblemOptimized {
    public static void main(String[] args) {
        int arr[][] = {{0,1,1,0},{0,0,0,0},{0,1,0,0},{1,1,0,0}};

        int n = arr.length;

        int top = 0;
        int bottom = n-1;

        while(top<bottom){
            if(arr[top][bottom]==1) top++;
            else if(arr[bottom][top]==1) bottom--;
            else{
                top++;
                bottom--;
            }
        }

        if(top>bottom) System.out.println(-1);
        else System.out.println(top);
        
    }
}
