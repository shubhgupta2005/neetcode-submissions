class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int alpha[]=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int count=c-'a';
            alpha[count]++;
            
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            int count=c-'a';
            alpha[count]--;
            
        }
        for(int i=0;i<26;i++){
            if(alpha[i]>0){
                return false;
            }
        }
        return true;



    }
}
