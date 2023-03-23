package solutions;

public class LongestPalindrome{
    public LongestPalindrome(){

    }
    public static String solution(String s){
        if(s.length() < 2)
            return s;
        int left;
        String retVal = s;
        String actualRetVal = "";
        int idxR = 0;
        int saveVal;
        int idxL = 0;
        int maxLen = 0;
        //saveVal = reverseIndexOf(s, s.charAt(0));
        for(left = 0; left < s.length()-1; left++){
            retVal = s.substring(left);
            saveVal = reverseIndexOf(retVal, retVal.charAt(0));
            if(!(retVal.charAt(retVal.length()-1) == retVal.charAt(0)))
                retVal = retVal.substring(0, saveVal+1);
            while(saveVal >= 0 && !isPalindrome(retVal, 0, saveVal)){
                //saveVal = reverseIndexOf(retVal, retVal.charAt(0));
                retVal = retVal.substring(0, saveVal);
                saveVal = reverseIndexOf(retVal, retVal.charAt(0));
                if(!(retVal.charAt(retVal.length()-1) == retVal.charAt(0)))
                    retVal = retVal.substring(0, saveVal+1);

            }
            if(saveVal >= 0 && isPalindrome(retVal, 0, saveVal)){
                int inter = maxLen;
                maxLen = Math.max(maxLen, retVal.length());
                if(inter != maxLen){
                    actualRetVal = retVal;
                }
            }

        }
        return actualRetVal;
    }

    public static boolean isPalindrome(String s, int left, int right){

        for(; ; left++){
            if(s.charAt(left) != s.charAt(right))
                return false;
            if(left == right || (left + 1 == right && s.charAt(left) == s.charAt(right)))
                break;
            right--;
        }
        return true;
    }

    public static int reverseIndexOf(String s, char c){
        for(int i = s.length()-1; i >=0; i--){
            if(s.charAt(i) == c)
                return i;
        }
        return -1;
    }
}
