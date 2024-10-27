package LeetcodeTasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Spiral_Matrix_II_59 {
    public static void main(String[] args) {
        int k = 3;
        int[][] test = generateMatrix_v1(k);
        int[][] j=generateMatrix_(k);
        System.out.println(Arrays.toString(j));
        for (int i = 0; i <k ;i++){
            System.out.println(Arrays.toString(j[i]));
        }





    }
    public static int[][] generateMatrix_v1(int n) {
        int[][] res = new int[n][n];
        boolean flag_x = true; //вправо
        boolean flag_y = true; // вниз
        for (int i = 0; i < n; i++) {
            int[] row  = new int[n];
            for (int j = 0; j < n; j++) {
                row[j] = (j+1)+n*i;

            }
            res[i] = row;



        }
        return res;

}
    public static int[][] generateMatrix_(int n) {
        int[][] res= new int[n][n];
        int x = 0;
        int y = 0;
        int dx = 1;
        int dy = 0;
        for (int i = 0; i < n*n; i++)
        {
            res[y][x] = i+1;
            if( x+dx >=n || y+dy >= n||x+dx <0||y+dy<0|| res[y+dy][x+dx]!=0 ) {
                int tmp = dx;
                dx = -dy;
                dy = tmp;
            }

            x+=dx;
            y+=dy;

        }
        return res;
    }


}


