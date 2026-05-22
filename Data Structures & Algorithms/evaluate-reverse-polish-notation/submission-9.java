class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String c : tokens) {
            if (!c.equals("+") && !c.equals("-") && !c.equals("*") && !c.equals("/")) {
                int a = Integer.parseInt(c);
                stack.push(a);

            }

            else if (c.equals("+")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a + b);
            } else if (c.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                int res = a - b;
                stack.push(res);
            } else if (c.equals("*")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a*b);

            } else {
                int a = stack.pop();
                int b = stack.pop();
                if (b != 0) {
                    int res = a / b;
                    stack.push(res);
                } 
            }
        }
        return stack.pop();
    }
}
