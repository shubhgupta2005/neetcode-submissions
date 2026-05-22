class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int left=0;
        int right=prices.length-1;
        while(left<right){
            if(prices[left]>prices[right]){
                left++;

            }else{
                int maxx=prices[right]-prices[left];
                max=Math.max(max,maxx);
                right--;
            }
        }
        return max;
        
    }
}
