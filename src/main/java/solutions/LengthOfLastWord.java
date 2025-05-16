package solutions;

public class LengthOfLastWord{
    public LengthOfLastWord(){

    }

    //Returns the length of the last word in a string.
    public int Solution(String s){
        int charCounter = 0;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == ' ' && charCounter != 0)
                return charCounter;
            else if(s.charAt(i) != ' ')
                charCounter++;
        }
        return charCounter;
    }
}
