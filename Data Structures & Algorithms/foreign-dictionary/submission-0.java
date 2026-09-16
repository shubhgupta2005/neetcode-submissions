class Solution {
    public String foreignDictionary(String[] words) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        int n = words.length;

        // Create adjacency list for 26 characters
        for (int i = 0; i < 26; i++) {
            adj.add(new ArrayList<>());
        }

        // Indegree of each character
        int[] indegree = new int[26];

        // Track characters that actually exist
        boolean[] exists = new boolean[26];

        for (String word : words) {
            for (char ch : word.toCharArray()) {
                exists[ch - 'a'] = true;
            }
        }

        // Build graph
        for (int i = 0; i < n - 1; i++) {

            String first = words[i];
            String second = words[i + 1];

            int len = Math.min(first.length(), second.length());

            boolean found = false;

            for (int j = 0; j < len; j++) {

                if (first.charAt(j) != second.charAt(j)) {

                    int u = first.charAt(j) - 'a';
                    int v = second.charAt(j) - 'a';

                    adj.get(u).add(v);

                    indegree[v]++;

                    found = true;

                    break;
                }
            }

            // Invalid case:
            // ["abc", "ab"]
            if (!found && first.length() > second.length()) {
                return "";
            }
        }

        // Kahn's Algorithm
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < 26; i++) {
            if (exists[i] && indegree[i] == 0) {
                q.add(i);
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!q.isEmpty()) {

            int node = q.poll();

            ans.append((char)(node + 'a'));

            for (int next : adj.get(node)) {

                indegree[next]--;

                if (indegree[next] == 0) {
                    q.add(next);
                }
            }
        }

        // If we couldn't include every existing character,
        // there is a cycle
        for (int i = 0; i < 26; i++) {
            if (exists[i] && indegree[i] > 0) {
                return "";
            }
        }

        return ans.toString();
    }
}