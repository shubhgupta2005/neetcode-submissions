class Solution {
public:
    bool isAnagram(string s, string t) {
        vector<int> count(26,1);
        if(s.length()!=t.length()) return false;
        for(char i :s){
            count[i-'a']++;
        }
        for(char i :t){
            count[i-'a']--;
        }

        for(int i:count){
            if(i!=1){
                return false;
            }
        }
        return true;
        
    }
};
