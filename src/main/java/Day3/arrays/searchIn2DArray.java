package Day3.arrays;

import Day2.arrays.inversionOfArrayMergeSortHardMethod;

public class searchIn2DArray {
    //Todo: Flattening a 2D array and also finding element using binary search, best way is co-ordinate = [index/n,index%n] where n is length of a row
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int rowToSearch=-1;

        for(int i=0;i<m;i++){
            if(matrix[i][n-1]>=target){
                rowToSearch = i;
                break;
            }
        }
        if(rowToSearch==-1){
            return false;
        }
        for(int j=0;j<n;j++){
            if(matrix[rowToSearch][j] == target){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args){
        int[][] matrix =   {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        boolean result = new searchIn2DArray().searchMatrix(matrix,3);
        System.out.println(result);
    }
}
