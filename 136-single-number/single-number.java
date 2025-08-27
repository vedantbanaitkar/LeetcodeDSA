import java.util.*;
class Solution {
    public int singleNumber(int[] arr) {
        HashSet<Integer> s = new HashSet<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            int e = arr[i];
            if(s.contains(e)){
                s.remove(e);
            }
            else{
                s.add(e);
            }
        }
        int k = 0;
        for(int num: s){
            k = num;
        }

        return k;
    }
}