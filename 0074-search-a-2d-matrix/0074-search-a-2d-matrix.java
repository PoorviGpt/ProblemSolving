class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       /*https://takeuforward.org/data-structure/search-in-a-sorted-2d-matrix/*/
       int n = matrix.length;
        int m = matrix[0].length;

        //apply binary search:
        int low = 0, high = n * m - 1;
        System.out.println("low high "+low+" "+high);
        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / m, col = mid % m;
            System.out.println("row col "+row+" "+col);
            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}