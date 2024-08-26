class MatrixTranspose{
    public static void main(String[] args){
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
            };
        findTranspose(matrix);

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
}