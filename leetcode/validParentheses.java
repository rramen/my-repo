import java.util.Stack;

/* 
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Input: s = "{[]}"
Output: true
*/
class validParentheses {
    public boolean isValid(String S) {
        boolean A = false, B = false, C = false;
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < S.length(); i++){
            switch(S.charAt(i)) {
                case '[': 
                    A = true;
                    stack.add('A');
                    break;
                case '{':
                    B = true;
                    stack.add('B');
                    break;
                case '(':
                    C = true;
                    stack.add('C')''
                    break;
                case ']': 
                    A = false;
                    break;
                case '}':
                    B = false;
                    break;
                case ')':
                    C = false;
                    break;                    
            }
        }
        return (A == false && B == false && C == false) ? true : false;
    }
};