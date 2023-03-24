package solutions;

public class PalindromeNumber{

    //note: I know I can just turn this to a string and trivially go about it, but I don't want to lol
    public PalindromeNumber(){

    }

    public boolean solution(int x){
        if(x < 0)
            return false;
        int right = 1;
        long left = 1;
        int digitCount = 0;
        long leftVal;
        long rightVal;

        while(x/left != 0){
            left *= 10;
            digitCount++;
        }
        left /= 10;
        for(int i = 0; i < digitCount/2; i++){
            leftVal = (x/left) % 10;
            rightVal = (x/right) % 10;
            if(leftVal != rightVal)
                return false;
            left /=10;
            right *= 10;
        }
        return true;
    }
}
