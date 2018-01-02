public static boolean rotateMatrix(int[][] matrix){
    if(matrix.length == 0 || matrix.length != matrix[0].length) return false;
    int n = matrix.length;
    for(int layer = 0; layer < n/2; layer++){
        int first = layer;
        int last = n-1-layer;
        for(int i = first; i < last; i++){
            int offset = i - first;
            int temp = matrix[first][i];
            matrix[first][i] = matrix[last-offset][first];
            matrix[last-offset][first] = matrix[last][last-offset];
            matrix[last][last-offset] = matrix[last][i];
            matrix[last][i] = temp;
        }
    }
    return true;
}
