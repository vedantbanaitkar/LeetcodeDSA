class Solution {
    public static List<List<Integer>> func(int ind, int[] arr, List<List<Integer>> ans){
        if(ind==arr.length){
            List<Integer> li = new ArrayList<>();
            for(int i=0; i<arr.length; i++){
                li.add(arr[i]);
            }
            ans.add(li);
            return ans;
        }
       Set<Integer> swappedSet = new HashSet<>(); // To track which elements have been swapped at this index
        for (int i = ind; i < arr.length; i++) {
            if (!swappedSet.contains(arr[i])) {
                swap(i, ind, arr);
                func(ind + 1, arr, ans);
                swap(i, ind, arr);
                swappedSet.add(arr[i]); // Mark the element as swapped at this index
            }
        }
        return ans;
    }
    public static void swap(int i, int j, int[] arr){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans = func(0, nums, ans);
        return ans;
    }
}