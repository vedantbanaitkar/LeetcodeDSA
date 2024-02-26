class Solution {
    public static int findJudge(int n, int[][] trust) {
        int[] incoming = new int[n+1];
        int[] outgoing = new int[n+1];
        for(int i=0; i<trust.length; i++){
            incoming[trust[i][1]-1]++;
            outgoing[trust[i][0]-1]++;
        }
        for(int i=0; i<n; i++){
            if(incoming[i]==n-1 && outgoing[i]==0){
                return i+1;
            }
        }
        return -1;
    }
}