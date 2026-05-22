class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int left=0;
        int right=1;
        while(right<prices.length){
            if(prices[left]<prices[right]){
                int maxx=prices[right]-prices[left];
                max=Math.max(max,maxx);

            }else{
                left=right;

            }
            right++;
            
        }
        return max;
        
    }
}
