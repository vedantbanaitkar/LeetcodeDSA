import java.util.HashMap;

public class Solution {
    public static long interchangeableRectangles(int[][] arr) {
        long count = 0;
        HashMap<Double, Integer> aspectRatioCount = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            double aspectRatio = (double) arr[i][0] / arr[i][1];
            aspectRatioCount.put(aspectRatio, aspectRatioCount.getOrDefault(aspectRatio, 0) + 1);
        }

        for (int countValue : aspectRatioCount.values()) {
            if (countValue > 1) {
                count += ((long) countValue * (countValue - 1)) / 2;
            }
        }

        return count;
    }
}