class Solution {
public:
    int getCommon(vector<int>& arr1, vector<int>& arr2) {
        int i=0; 
        int j=0;
        int l1=arr1.size();
        int l2=arr2.size();
        
        while(i<l1 && j<l2){
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