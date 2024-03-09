class Solution {
public:
    int getCommon(vector<int>& arr1, vector<int>& arr2) {
        int i=0; 
        int j=0;
        
        while(i<arr1.size() && j<arr2.size()){
            if(arr1[i]==arr2[j]){
                return arr1[i];
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return -1;
    }
};