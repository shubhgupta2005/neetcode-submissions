class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.length()!=t.length()){
            return false;
        }
        vector<int> count(26,0);
        for(char c :s){
            count[c-'a']++;

        }
        for(char c : t){
            count[c-'a']--;
        }
        for(int i=0;i<count.size();i++){
            if(count[i]!=0){
                return false;
                break;
            }
        }
        return true;

        
    }
};
