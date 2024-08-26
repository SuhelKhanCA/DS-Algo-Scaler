class Rotate90Clockwise{
    public static void main(String[] args) {
       int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
            };
        findTranspose(matrix);
        reverseRowWise(matrix);
        for(int[] a: matrix){
            for(int b: a){
                System.out.print(b + " ");
            }
            System.out.println();
        }       
    }

    static void findTranspose(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void reverseRowWise(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                int left = 0;
                int right = matrix[i].length -1;
                while(left <= right){
                    int temp = matrix[i][left];
                    matrix[i][left] = matrix[i][right];
                    matrix[i][right] = temp;
                    left++;
                    right--;
                }    
            }
        }
    } 
}