class Solution {
    public static String[] sortPeople(String[] n, int[] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    String t = n[j];
                    n[j] = n[j+1];
                    n[j+1] = t;
                }
            }
        }
        return n;
    }
}