package solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinations{
    public LetterCombinations(){

    }

    public List<String> solution(String digits){
        if(digits.isEmpty())
            return new ArrayList<>();
        List<String> ans = new LinkedList<>();
        String[] lookUp = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String s;
        ans.add("");
        for(int i = 0; i < digits.length(); i++){
            int digit = digits.charAt(i) - '0';
            int size = ans.size();
            for(int x = 1; x <=size; x++){
                s = ans.remove(0);
                for(char c : lookUp[digit].toCharArray()){
                    ans.add(s + c);
                }
            }

        }
        return ans;
    }
}
