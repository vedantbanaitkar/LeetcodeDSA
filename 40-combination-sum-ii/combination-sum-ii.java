class Solution {
     public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        func(0, candidates, new ArrayList<>(), result, target);
        return result;
    }

    public static void func(int start, int[] candidates, List<Integer> current, List<List<Integer>> result, int target) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates to avoid duplicate combinations
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // Prune unnecessary branches early
            if (candidates[i] > target) {
                break;
            }

            current.add(candidates[i]);
            func(i + 1, candidates, current, result, target - candidates[i]);
            current.remove(current.size() - 1);
        }
    }
}