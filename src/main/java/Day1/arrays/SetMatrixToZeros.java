package Day1.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatrixToZeros {
    public static void main (String[] args){

        int[][] matrix =  {{0,1,2,0},
                                {3,4,5,2},
                                {1,3,1,5}};

        ArrayList<Integer> verticalZero = new ArrayList();
        ArrayList<Integer> horizontalZero = new ArrayList();

        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++){
                if (matrix[i][j] == 0){
                    horizontalZero.add(i);
                    verticalZero.add(j);
                }
            }
        }

        for(int element : verticalZero){
            for(int i=0;i< matrix.length;i++){
                matrix[i][element]=0;
            }
        }

        for(int element : horizontalZero){
            Arrays.fill(matrix[element],0);
        }

        //print output matrix
        for (int[] list : matrix) {
            for (Integer num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

