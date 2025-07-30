import java.util.*;
class Solution {
    public int maxFrequencyElements(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
        }
        int max=-1;
        for(int key: mp.keySet()){
            int k = mp.get(key);
            if(k>max){
                max = k;
            }
        }
        int s=0;
        for(int key: mp.keySet()){
            int t = mp.get(key);
            if(t==max){
                s+=max;
            }
        }
        return s;
    }
}