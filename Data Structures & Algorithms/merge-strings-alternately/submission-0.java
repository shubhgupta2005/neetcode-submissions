class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        StringBuilder res = new StringBuilder();

        int l = 0;
        int r1 = w1.length - 1;
        int r2 = w2.length - 1;

        while (l <= r1 && l <= r2) {
            res.append(w1[l]);
            res.append(w2[l]);
            l++;
        }

        // Remaining characters of word1
        while (l <= r1) {
            res.append(w1[l]);
            l++;
        }

        // Remaining characters of word2
        while (l <= r2) {
            res.append(w2[l]);
            l++;
        }

        return res.toString();
    }
}