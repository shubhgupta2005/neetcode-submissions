class Solution {
    public boolean validPalindrome(String s) {
        char[] ch=s.toCharArray();
        int l=0;
        int r=ch.length-1;
        int count=0;

        while(l<=r){
            if(Character.toLowerCase(ch[l])!=Character.toLowerCase(ch[r])){
                if(count<2){
                    r--;
                    count++;
                    if(Character.toLowerCase(ch[l])!=Character.toLowerCase(ch[r])) return false;

                }
            }else{
                l++;
                r--;
            }
        }
        return true;
        
    }
}