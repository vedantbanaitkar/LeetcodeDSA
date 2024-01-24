import java.util.*;
class Solution {

     
     public static List<Boolean> kidsWithCandies(int[] arr, int e) {
         int max = Math.max(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
          max = Math.max(max, arr[i]);
        }
        int m = max;
         List<Boolean> li= new ArrayList<>();
         for(int i=0; i<arr.length; i++){
             if(arr[i]+e>=m){
                 li.add(true);
             }
             else{
                 li.add(false);
             }
         }
         return li;
     }
}