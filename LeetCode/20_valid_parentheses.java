class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        int l = s.length();
        if(l%2!=0) return false;
        for(int i=0;i<l;i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' && stack.empty() == false) {
                if(stack.peek() == '(')
                    stack.pop();
                else
                    break;
            }
            else if(s.charAt(i) == '}' && stack.empty() == false) {
                if(stack.peek() == '{')
                    stack.pop();
                else
                    break;
            }
            else if(s.charAt(i) == ']' && stack.empty() == false) {
                if(stack.peek() == '[')
                    stack.pop();
                else
                    break;
            }
            else {
                return false;
            }
        }
        if(stack.empty()) {
            return true;
        }
        else {
            return false;
        }
    }
}