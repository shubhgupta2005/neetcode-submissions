class Solution {
public:
    int trap(vector<int>& height) {
        int l=0;
        int r=height.size()-1;
        int left=height[l];
        int right=height[r];
        int res=0;
        while(l<r){
            if(left<right){
                l++;
                left=max(left,height[l]);
                res+=left-height[l];
            }else{
                r--;
                right=max(right,height[r]);
                res+=right-height[r];
            }
        }
        return res;
        
    }
};
