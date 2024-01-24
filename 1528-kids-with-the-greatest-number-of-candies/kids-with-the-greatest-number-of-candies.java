import java.util.*;
class Solution {

     
     public static List<Boolean> kidsWithCandies(int[] arr, int e) {
         int m = 0;
        for(int i=0; i < arr.length; i++) {
            if(arr[i] > m) {
                m = arr[i];
            }
        }
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