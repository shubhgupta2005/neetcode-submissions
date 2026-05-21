class Solution {
public:
    int characterReplacement(string s, int k) {
        unordered_map<char,int>mpp;
        int l=0;int r=0;
        int maxlen=0; int maxcount=0;
        while(r<s.size()){
            mpp[s[r]]++;
            maxcount=max(maxcount,mpp[s[r]]);
            while((r-l+1)-maxcount>k){
                mpp[s[l]]--;
                l++;
            }
            maxlen=max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
};
