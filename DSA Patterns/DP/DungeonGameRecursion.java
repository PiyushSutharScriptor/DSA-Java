public class DungeonGameRecursion {

    public static int maxi = (int)1e8;

    public static int findMini(int x, int y, int[][] arr){
        int m = arr.length;
        int n = arr[0].length;

        if(x == m-1 && y == n-1){
            return Math.max(1, 1 - arr[x][y]);
        }

        if(x >= m || y >= n) return maxi;

        int down = findMini(x+1, y, arr);
        int right = findMini(x, y+1, arr);

        int need = Math.min(down, right) - arr[x][y];

        return Math.max(1, need);
    }

    public static void main(String[] args) {
        int[][] arr = {{-2,-3,3},{-5,-10,1},{10,30,-5}};

        int res = findMini(0, 0, arr);
        System.out.println(res); 
    }
}
