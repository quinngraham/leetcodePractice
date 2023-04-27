package solutions;

import java.util.ArrayList;
import java.util.List;

public class GeneratePthsis{
    public GeneratePthsis(){

    }

    public List<String> solution(int n){
        List<String> sol = new ArrayList<>();
        rec(sol, "", n, 0, 0);
        return sol;
    }

    public void rec(List<String> list, String str, int max, int open, int close){
        if(str.length() == max*2){
            list.add(str);
            return;
        }

        if(open < max)
            rec(list, str + '(', max, open+1, close);
        if(close < open)
            rec(list, str + ')', max, open, close+1);
    }

}
