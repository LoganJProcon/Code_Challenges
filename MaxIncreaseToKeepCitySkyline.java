package NeedMoreSpace3;

public class MaxIncreaseToKeepCitySkyline {
    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int maxTotalSum = 0;

        //Check the row and colum for the second-highest number between the two
        for(int i = 0; i < grid.length; i++){
            //I is for the colum and K is for the row
            for(int k = 0; k < grid.length; k++) {
                int rowMax = 0;
                int colMax = 0;
                //Check the y-axis in relation to point of grid[k][i]
                for(int y = 0; y < grid.length; y++) {
                    if(grid[k][y] > colMax) colMax = grid[k][y];
                }
                //Check the x-axis in relation to point of grid[k][i]
                for(int x = 0; x < grid.length; x++) {
                    if(grid[x][i] > rowMax) rowMax = grid[x][i];
                }
                //Check which is the minimum largest number and subtract the value at the point of comparison from it and add the result to the current maxTotalSum
                if(rowMax < colMax) maxTotalSum += (rowMax - grid[k][i]);
                else maxTotalSum += (colMax - grid[k][i]);
            }
        }

        return maxTotalSum;
    }
    //grid of [[0,0,0],[0,0,0],[0,0,0]] works
    //grid of [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]] works
    //grid of [[59,88,44],[3,18,38],[21,26,51]] works
    public static void main(String[] args) {
        int[][] grid = new int[3][3];
        grid[0][0] = 59;
        grid[1][0] = 88;
        grid[2][0] = 44;
        grid[0][1] = 3;
        grid[1][1] = 18;
        grid[2][1] = 38;
        grid[0][2] = 21;
        grid[1][2] = 26;
        grid[2][2] = 51;
        System.out.println(maxIncreaseKeepingSkyline(grid));
    }
}