package day3;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };
        int target = 50;
        boolean ans = search(matrix, target);
        System.out.println(search(matrix, -1));
        System.out.println(ans);
    }
// complexity: O(n)
    public static boolean search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >=0) {
            if(matrix[row][col] == target) {
                return true;
            }
            if(matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
}
