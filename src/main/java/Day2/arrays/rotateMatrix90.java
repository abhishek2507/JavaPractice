package Day2.arrays;

public class rotateMatrix90 {
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main (String[] args){

        int[][] matrix =   {{0,1,2,0},
                            {3,4,5,2},
                            {1,3,1,5},
                            {2,7,2,9}};



        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<i+1;j++){
                if (i != j ){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

       for(int i = 0; i< matrix.length;i++){
           reverseArray(matrix[i]);
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

