class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        List<Integer> l = new ArrayList<>();
        int k = 0, left = 0, top = 0, right = m - 1, bottom = n - 1;

        while (k < n * m) {
            for (int i = left; i <= right; i++) {
                l.add(matrix[top][i]);
                k++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                l.add(matrix[i][right]);
                k++;
            }
            right--;
            if ( top <= bottom) {
                for (int i = right; i >= left; i--) {
                    l.add(matrix[bottom][i]);
                    k++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    l.add(matrix[i][left]);
                    k++;
                }
                left++;
            }
        }
        return l;
    }
}