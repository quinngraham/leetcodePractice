package solutions;

public class MyStrToInt{
    public MyStrToInt(){

    }

    public int solution(String s){
        if(s.length() == 0)
            return 0;
        char[] charArr = s.toCharArray();
        int idx = 0;
        int val;
        int retVal = 0;
        boolean negFlag = false;
        char checkVal = ' ';
        while(checkVal == ' ' && idx < s.length()){
            checkVal = charArr[idx];
            if(checkVal == ' ' || checkVal == '+' ||checkVal == '-')
                idx++;
        }
        if(checkVal == '-')
            negFlag = true;
        for(int i = idx; i <s.length(); i++){
            checkVal = charArr[i];
            val = checkVal - 48;
            if(val < 0 || val > 9)
                break;
            if(retVal - (Integer.MAX_VALUE)/10 > 0)
                return negFlag ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            else if(negFlag && retVal - (Integer.MAX_VALUE)/10 == 0 && val >= 8)
                return Integer.MIN_VALUE;
            else if(!negFlag && retVal - (Integer.MAX_VALUE)/10 == 0 && val >= 7)
                return Integer.MAX_VALUE;
            retVal *= 10;
            retVal += val;
        }
        return negFlag ? retVal*-1 : retVal;
    }
}
