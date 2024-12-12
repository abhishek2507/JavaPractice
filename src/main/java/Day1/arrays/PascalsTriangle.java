package Day1.arrays;
import java.util.ArrayList;
import java.util.List;
public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> pascal = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            if (i==0){
                row.add(1);
            }
            else{
                for(int j=0;j<=i;j++){
                    if(j==0 || j==i){
                        row.add(1);
                    }
                    else{
                        row.add(pascal.get(i-1).get(j-1)+pascal.get(i-1).get(j));
                    }

                }
            }
            pascal.add(row);
        }

        //Code for printing pascal triangle
        int maxWidth = pascal.get(numRows - 1).stream()
                .mapToInt(num -> String.valueOf(num).length())
                .max().orElse(1);
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = pascal.get(i);
            int numSpaces = (numRows - i - 1) * (maxWidth + 1) / 2;
            for (int k = 0; k < numSpaces; k++) {
                System.out.print(" ");
            }
            for (Integer num : row) {
                System.out.printf("%-" + maxWidth + "d ", num);
            }
            System.out.println();
        }
    }
}
