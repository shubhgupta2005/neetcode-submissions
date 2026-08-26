class Solution {
    public int maxProfit(int[] prices) {
        int left=0;
        int right=1;
        int max=0;

        while(right<prices.length){
            int sum=0;
            if(prices[left]>prices[right]){
                left=right;
                right++;
            }else{
                sum=prices[right]-prices[left];
                right++;
            }
            max=Math.max(sum,max);


        }
        return max;
        
    }
}
