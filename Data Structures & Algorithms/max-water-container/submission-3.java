class Solution {
    public int maxArea(int[] arr) {
        int l=0;
        int r=arr.length-1;
        int max=Integer.MIN_VALUE;
        while(l<r){
            int len=r-l;
            int h=Math.min(arr[l],arr[r]);
            int res=len*h;
            max=Math.max(max,res);
            if(arr[l]<arr[r]){
                l++;
            }else{
                r--;
            }
            

        }
        return max;
        
    }
}
