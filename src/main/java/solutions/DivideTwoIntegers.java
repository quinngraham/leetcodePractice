package solutions;

public class DivideTwoIntegers{
    public DivideTwoIntegers(){

    }


    /*
     * The problem set for this doesn't really make sense, as there are tons of examples that
     * have to deal with overflow. They should have changed the problem description to
     * adhere to these problems.
     */

    public int solution(int dividend, int divisor){
        boolean neg = (dividend < 0) ^ (divisor < 0);
        int res = 0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        while(dividend-divisor > 0){
            dividend -= divisor;
            res += 1;
        }
        if(neg)
            return -res;
        return res;
    }
}
