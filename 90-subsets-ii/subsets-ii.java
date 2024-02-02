import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        generateSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void generateSubsets(int[] nums, int start, List<Integer> currentSubset, List<List<Integer>> result) {
        result.add(new ArrayList<>(currentSubset));

        for (int i = start; i < nums.length; i++) {
            // Skip duplicates to avoid duplicate subsets
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            currentSubset.add(nums[i]);
            generateSubsets(nums, i + 1, currentSubset, result);
            currentSubset.remove(currentSubset.size() - 1);
        }
    }
}
