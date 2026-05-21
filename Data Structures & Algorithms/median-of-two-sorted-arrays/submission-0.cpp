class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int n1=nums1.size();
        int n2=nums2.size();
        vector<int> nums3(n1+n2,0);
        for(int i=0;i<n1;i++){
            nums3[i]=nums1[i];
        }
        for(int i=0;i<n2;i++){
            nums3[n1+i]=nums2[i];

        }

        sort(nums3.begin(),nums3.end());
         int n = nums3.size();
        int mid = n / 2;

        if (n % 2 == 0) {
            // Even length → average of two middle elements
            return (nums3[mid - 1] + nums3[mid]) / 2.0;
        } else {
            // Odd length → middle element
            return nums3[mid];
        }
        
        
    }
};
