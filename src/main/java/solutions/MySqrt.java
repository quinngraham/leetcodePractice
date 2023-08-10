package solutions;

public class MySqrt{

    public MySqrt(){

    }

    public int solution(int x){

        if(x <= 1) return x;

        int start = 0, end = x, mid = -1;

        while( start <= end){
            mid = start + (end-start)/2;

            if((long) mid*mid > (long) x)
                end = mid-1;
            else if(mid*mid == x)
                return mid;
            else
                start = mid+1;
        }
        return end;
    }
}
