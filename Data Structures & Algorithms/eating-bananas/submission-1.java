class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=0;
        int r=1;
        for (int p : piles) {
            r = Math.max(r, p);
        }
        int res=r;

        while(l<=r){
            int m=(r+l)/2;
            long totaltime=0;
            for(int i=0;i<piles.length;i++){
                totaltime+=Math.ceil((double)piles[i]/m);
            }
            if(totaltime<=h){
                res=m;
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return res;
    }
}
