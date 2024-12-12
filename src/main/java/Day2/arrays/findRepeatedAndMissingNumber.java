package Day2.arrays;

public class findRepeatedAndMissingNumber {
    public int[] repeatedNumberHashing(final int[] A) {
        int[] count = new int[A.length+1];
        for(int i = 0;i<A.length;i++){
            count[A[i]] +=1;
        }
        int missing = -1;
        int repeated = -1;
        for(int i = 1; i< count.length; i++){
            if(count[i]==2) repeated = i;
            else if(count[i]==0) missing = i;

            if(missing!=-1 && repeated !=-1){
                break;
            }
        }
        int[] output = {repeated,missing};
        return output;
    }
    public int[] repeatedNumberSumAndsumSquareMethod(final int[] A) {
        int repeat = -1;
        int missed = -1;
        int n = A.length;
        long assumedsumm = (long) n * (n + 1) / 2;
        long assumedSquareSumm = (long) (n * (n + 1) * (2 * n + 1)) / 6;
        long summ = 0;
        long squaresumm = 0;

        for (int i = 0; i < A.length; i++) {
            summ += A[i];
            squaresumm += (long) A[i] * A[i];
        }
        long repeatMinusMiss = summ - assumedsumm;
        long repeatPlusMiss = (squaresumm - assumedSquareSumm) / repeatMinusMiss;
        repeat = (int) ((repeatPlusMiss + repeatMinusMiss) / 2);
        missed = (int) ((repeatPlusMiss - repeatMinusMiss) / 2);
        return new int[]{repeat, missed};
    }
    public static void main(String[] args){
        int[] interval =   {1,3,4,2,2};
        int[] result = new findRepeatedAndMissingNumber().repeatedNumberHashing(interval);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
