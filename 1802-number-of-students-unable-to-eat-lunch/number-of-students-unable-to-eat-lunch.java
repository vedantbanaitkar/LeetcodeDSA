import java.util.*;
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zCount = 0, oCount = 0;

        for(int i=0; i<students.length; i++){
            if(students[i]==0){
                zCount++;
            }else{
                oCount++;
            }
        }
        for(int i=0; i<sandwiches.length; i++){
            if(sandwiches[i]==0 && zCount==0) return oCount;
            if(sandwiches[i]==1 && oCount==0) return zCount;
            
            if(sandwiches[i]==0){
                zCount--;
            }
            else{
                oCount--;
            }
        }
        return 0;
    }
}