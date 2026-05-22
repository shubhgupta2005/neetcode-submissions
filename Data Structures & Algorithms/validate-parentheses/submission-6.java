class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else {
                if (stack.empty())
                    return false;
                char ch = stack.pop();
                if ((ch == '(' && c != ')') || (ch == '{' && c != '}') || (ch == '[' && c != ']')) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
