package Chapter8;

/**
 * Created by Max Kondrashov on 10/15/2015.
 */
public class Eight_2_Max {

    public static void main(String[] args) {

        boolean grid[][] = new boolean[5][5];
        for(int i = 0; i <grid.length;i++){
            for(int j = 0; j < grid.length;j++){
                grid[i][j] = true;
            }
        }
        grid[3][1]=false;
        grid[4][1]=false;
        grid[3][3]=false;
        grid[3][4]=false;

        start(grid);
    }

    public static void start(boolean[][] array){
        String path = path(0,0,array);
        System.out.print(path);
    }

    public static String path(int x, int y, boolean[][] array){
        if(x > array.length - 1 || y > array[0].length - 1 || !array[x][y]){
            return null;
        }
        if(x == array.length - 1 || y == array[0].length - 1){
            return " "+x+", "+y+".";
        }
        String right = path(x+1, y, array);
        if( right != null){
            return " "+x+", "+y + right;
        }
        String bot = path(x+1, y, array);
        if( bot != null){
            return " "+x+", "+y + bot;
        }
        return "Error";

    }


}
