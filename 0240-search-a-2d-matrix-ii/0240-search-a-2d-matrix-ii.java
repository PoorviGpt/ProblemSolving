class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        
        int row=0, col=m-1;
        
        while((row>=0 && row<=n-1) && (col>=0 && col<=m-1))
        {
            if(target < matrix[row][col])
                col=col-1;
            else if(target==matrix[row][col])
                return true;
            else if(target > matrix[row][col])
                row=row+1;
        }
        return false;
    }
}