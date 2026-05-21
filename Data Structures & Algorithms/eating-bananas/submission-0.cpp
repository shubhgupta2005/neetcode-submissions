class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int l = 1;  // eating speed must be >= 1
        int r = *max_element(piles.begin(), piles.end());
        int res = r;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            long long hours = 0;

            for (int p : piles) {
                hours += (p + mid - 1) / mid; // integer ceil
            }

            if (hours <= h) {   // ✅ check against h
                res = mid;
                r = mid - 1;    // try smaller
            } else {
                l = mid + 1;    // need bigger
            }
        }
        return res;
    }
};
