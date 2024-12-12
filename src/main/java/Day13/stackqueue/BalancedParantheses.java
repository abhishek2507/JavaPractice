package Day13.stackqueue;

import Day5.linkedlist.FindMiddleLinkedList;

import java.util.Stack;

class BalancedParantheses {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();

        for(char c : s.toCharArray()){
            if (c == '(' || c == '{' || c == '['){
                brackets.push(c);
            }
            else if (c == ')' || c == '}' || c == ']'){
                if(brackets.isEmpty()){
                    return false;
                }

                char pop = brackets.pop();
                if ((c == ')' && pop != '(') ||
                        (c == '}' && pop != '{') ||
                        (c == ']' && pop != '[')) {
                    return false;
                }
            }
        }
        return brackets.isEmpty();
    }

    public static void main(String[] args) {
        String brackets = "([])";
        System.out.println(new BalancedParantheses().isValid(brackets));
        brackets = "()[]";
        System.out.println(new BalancedParantheses().isValid(brackets));
        brackets = "([)]";
        System.out.println(new BalancedParantheses().isValid(brackets));
    }
}