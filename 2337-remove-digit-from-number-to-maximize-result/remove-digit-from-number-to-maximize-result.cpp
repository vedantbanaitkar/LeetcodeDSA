class Solution {
public:
    string removeDigit(string number, char digit) {
        string s = number;
        string ans = "";
        for(int i=0; i<number.length(); i++){
            if(number[i]==digit){
                s.erase(i, 1);
                if(s>ans){
                    ans = s;
                }
            }
            s = number;
        }
        return ans;
    }
};