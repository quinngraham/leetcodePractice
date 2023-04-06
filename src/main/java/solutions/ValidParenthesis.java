package solutions;

import java.util.Stack;

public class ValidParenthesis{
    public ValidParenthesis(){

    }

    public boolean solution(String s){
        Stack<Character> check = new Stack<>();
        for(char c : s.toCharArray()){
            switch(c){
                case '(' -> check.push(')');
                case '{' -> check.push('}');
                case '[' -> check.push(']');
                default -> {
                    if(check.isEmpty() || check.pop() != c)
                        return false;
                }
            }
        }
        return check.isEmpty();
    }
}
