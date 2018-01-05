public class HelloWorld{

    public static void main(String []args){
        int [][] num = new int [3][3]; 
        num[0][0] = 1; 
        num[0][1] = 0;
        num[0][2] = 1; 
         
        num[1][0] = 1; 
        num[1][1] = 1; 
        num[1][2] = 1;
         
        num[2][0] = 2; 
        num[2][1] = 1; 
        num[2][2] = 1; 
        zeroMatrix(num);
        System.out.println(num[0][0]);
        System.out.println(num[0][1]);
        System.out.println(num[0][2]);
        System.out.println(num[1][0]);
        System.out.println(num[1][1]);
        System.out.println(num[1][2]);
        System.out.println(num[2][0]);
        System.out.println(num[2][1]);
        System.out.println(num[2][2]);
     }

    public static void zeroMatrix(int[][] matrix){
        int numrow = matrix.length;
        int numcolumn = matrix[0].length;
        boolean[][] check = new boolean[numrow][numcolumn];
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0) check[i][j]=true;
                System.out.println(check[i][j]);
            }
        }
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0 && check[i][j]){
                    nullifyColumn(i, matrix.length, matrix);
                    nullifyRow(j, matrix[0].length, matrix);
                }
            }
        }
        
    }
    

    static void nullifyColumn(int i, int input, int[][] matrix){
        for(int x = 0; x < input; x++){
             matrix[i][x] = 0;
        }
    }

    static void nullifyRow(int j, int input, int[][] matrix){
        for(int y = 0; y < matrix[0].length; y++){
             matrix[y][j] = 0;
        }
    }
    
}
