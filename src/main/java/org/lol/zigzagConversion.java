package org.lol;

public class zigzagConversion{
    public String solution(String s, int numRows) {
        if(s.length() <= numRows || numRows == 1)
            return s;
        StringBuilder ans = new StringBuilder();
        int diff = (numRows*2)-2;
        int diagDiff = 0; //to be calculated when i need it
        int idx = 0;

        for(int i = 0; i < numRows; i++){
            idx = i;
            if(i == 0 || i == numRows-1){
                while(idx < s.length()){
                    ans.append(s.charAt(idx));
                    idx += diff;
                }
            }
            else{
                ans.append(s.charAt(idx));
                idx += diff;
                diagDiff = idx - (i*2);
                if(idx >= s.length() && diagDiff < s.length())
                    ans.append(s.charAt(diagDiff));
                while(idx < s.length()){
                    ans.append(s.charAt(diagDiff));
                    ans.append(s.charAt(idx));
                    idx += diff;
                    diagDiff = idx - (i*2);
                    if(idx >= s.length() && diagDiff < s.length())
                        ans.append(s.charAt(diagDiff));
                }
            }
        }
        return ans.toString();
    }
}
