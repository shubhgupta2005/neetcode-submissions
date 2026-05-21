class Solution {
public:
    int maxArea(vector<int>& heights) {
        int l=0;
        int r=heights.size()-1;
        int res=0;
        while(l<r){
            int low=min(heights[l],heights[r]) ;
            int area=low*(r-l);
            res=max(area,res);
            if(heights[l]<=heights[r]){
                l++;
            }else{
                r--;
            }
            

        }
        return res;
        
    }
};
