public class RepresentOfWeightGraphInMatrix {
    public static void main(String[] args) {
        int n = 3;
        
        int adj[][] = new int [n+1][n+1];

        // 1--2
        adj[1][2] = 11;
        adj[2][1] = 12;

        // 2--3
        adj[2][3] = 31;
        adj[3][2] = 42;

        // 1--3
        adj[1][3] = 98;
        adj[3][1] = 78;

        for(int i=0 ; i<adj.length ; i++){
            for(int j=0 ; j<adj[0].length ; j++){
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }
}
