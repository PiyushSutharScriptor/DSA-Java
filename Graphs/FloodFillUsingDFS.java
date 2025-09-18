public class FloodFillUsingDFS {

    public static void fillColor(int[][] image, int sr, int sc, int color){
        int init = image[sr][sc];
        int drow[] = {-1,0,1,0};
        int dcol[] = {0,1,0,-1};

        dfs(init,drow,dcol,image,color,sr,sc);
    }

    public static void dfs(int init, int[] drow, int[] dcol, int[][] image, int color, int row, int col){

        image[row][col] = color;

        int m = image.length;
        int n = image[0].length;

        for(int i=0 ; i<4; i++){
            int nrow = row+drow[i];
            int ncol = col+dcol[i];

            if(nrow>=0 && ncol>=0 && nrow<m && ncol<n && image[nrow][ncol]==init && image[nrow][ncol]!=color){
                dfs(init, drow, dcol, image, color, nrow, ncol);
            }
        }
    }
    public static void main(String[] args) {
        int image[][] = {{1,1,1},{1,1,0},{1,0,1}};  
        int sr = 1;
        int sc = 1;
        int color = 2;

        fillColor(image,sr,sc,color);

        for(int i=0 ; i<image.length ; i++){
            for(int j=0 ; j<image[i].length ; j++){
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
}
