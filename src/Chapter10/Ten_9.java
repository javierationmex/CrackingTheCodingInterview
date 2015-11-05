package Chapter10;

/**
 * Created by Javier G on 11/5/2015.
 */
public class Ten_9 {

    public static void main(String[] args) {

        int[][] matrix = new int[][]{
                { 15, 20, 40, 85},
                { 20, 35, 80, 95},
                { 30, 55, 95, 105},
                { 40, 80, 106, 120}
        };

        System.out.println("Is 35 in the array? " + findElement(matrix, 35));
        System.out.println("Is 120 in the array? " + findElement(matrix, 120));
        System.out.println("Is 95 in the array? " + findElement(matrix, 95));
        System.out.println("Is 27 in the array? " + findElement(matrix, 27));

    }

    public static boolean findElement(int[][] matrix, int elem){
        int r = 0;
        int c = 0;
        int boundR = matrix.length - 1;
        int boundC = matrix[0].length - 1;

        while (r < matrix.length){
            if (matrix[r][0] > elem){
                boundR = r - 1;
                break;
            }
            r++;
        }

        while (c < matrix[0].length){
            if (matrix[0][c] > elem){
                boundC = c - 1;
                break;
            }
            c++;
        }

        for(int row = boundR; row >= 0; row--){
            for(int col = boundC; col >= 0; col--){
                if (matrix[row][col] == elem){
                    return true;
                }
            }
        }

        return false;
    }

}
