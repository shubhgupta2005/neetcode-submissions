class Solution {
    public boolean isPalindrome(String s) {
        char[] c=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            if(!Character.isLetterOrDigit(c[left])) { left++; continue; }
            if(!Character.isLetterOrDigit(c[right])) { right--; continue; }
            if(Character.toLowerCase(c[left])!=Character.toLowerCase(c[right])) return false;
            left++;
            right--;
        }
        return true;
    }
}
