class Solution {
public:
    bool isAnagram(string s, string t) {
        vector<char>count(26,0);
        if(s.length()!=t.length()){
            return false;
        }
        for(char c : s){
            count[c-'a']++;
        }
        for(char c: t){
            count[c-'a']--;
        }

        for( int c :count){
            if(c!=0){
                return false;
            }
        }
        return true;
        
    }
};
