package Day2.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class mergeIntervals {

    public int[][] merge(int[][] intervals) {
        boolean updated = false;
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
        result.add(newInterval);
        for(int[] interval: intervals){
            if(interval[0]<=newInterval[1])
                newInterval[1] = Math.max(newInterval[1],interval[1]);
            else{
                newInterval = interval;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);


    }
    public static void main(String[] args){
        int[][] interval =   {{0,1},{2,4},
                {3,6}};

        for (int[] list : new mergeIntervals().merge(interval)) {
            for (Integer num : list) {
                System.out.print(num + " ");
            }
            System.out.print("|");
        }
    }
}
