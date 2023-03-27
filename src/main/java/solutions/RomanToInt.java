package solutions;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt{
    public RomanToInt(){

    }

    public int solution(String s){
        int ans = 0;
        int num = 0;
        int prev = 0;

        for(int i = s.length()-1; i >=0; i--){
            switch(s.charAt(i)){
                case 'I' -> num = 1;
                case 'V' -> num = 5;
                case 'X' -> num = 10;
                case 'L' -> num = 50;
                case 'C' -> num = 100;
                case 'D' -> num = 500;
                case 'M' -> num = 1000;
            }
            //doing it this way is apparently slower and uses more mem????
            //could change this to a reg if else for better performance
            ans += prev > num ? num*-1 : num;
            prev = num;
        }
        return ans;
    }
}
