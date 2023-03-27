package solutions;

public class IntToRoman{
    public IntToRoman(){

    }

    public String solution(int num){
        StringBuilder ans = new StringBuilder();
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] nums =        {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        int idx = 0;
        while(num > 0){
            while(num >= nums[idx]){
                ans.append(numerals[idx]);
                num -= nums[idx];
            }
            idx++;
        }
        return ans.toString();
    }
}
