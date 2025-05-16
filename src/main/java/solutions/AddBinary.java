package solutions;

public class AddBinary{
    public AddBinary(){

    }


    public String solution(String a, String b){
        /*
          Case 1: Add two 1's, no carry.
          Case 2: Add two 1's, with carry.
          Case 3: Add a 1 and a 0, no carry.
          Case 4: Add a 1 and 0, with carry.
          Case 5: Add a 0 and 0, with carry.
         */

        //Character array to make modifying it easier and less mem intensive. Making it as big as it will ever need to be.
        char[] resBuilder = a.length() > b.length() ? new char[a.length()+1]:new char[b.length()+1];

        //This is our carry indicator: 1 is carry, 0 is no carry.
        boolean carry = false;

        int diff = a.length() > b.length() ? a.length() - b.length():b.length() - a.length();

        if(a.length() > b.length()){
            for(int i = a.length()-1; i >= -1; i--){
                //terminating case.
                if(i == -1){
                    resBuilder[0] = carry ? '1':' ';
                }
                //add 0 and 0.
                else if(a.charAt(i) == '0' && (i-diff < 0 || b.charAt(i-diff) == '0')){
                    resBuilder[i+1] = carry ? '1':'0';
                    carry = false;
                }
                //1 and 0, carry remains the same.
                else if(a.charAt(i) == '1' && (i-diff < 0 || b.charAt(i-diff) == '0')){
                    resBuilder[i+1] = carry ? '0':'1';
                }
                //1 and 0, carry remains the same (could technially do this in one statement but it would look FOUL).
                else if(a.charAt(i) == '0'){
                    resBuilder[i+1] = carry ? '0':'1';
                }
                //1 and 1
                else{
                    resBuilder[i+1] = carry ? '1':'0';
                    carry = true;
                }
            }
        }
        else{
            for(int i = b.length()-1; i >= -1; i--){
                //terminating case.
                if(i == -1){
                    resBuilder[0] = carry ? '1':' ';
                }
                //add 0 and 0.
                else if(b.charAt(i) == '0' && (i-diff < 0 || a.charAt(i-diff) == '0')){
                    resBuilder[i+1] = carry ? '1':'0';
                    carry = false;
                }
                //1 and 0, carry remains the same.
                else if(b.charAt(i) == '1' && (i-diff < 0 || a.charAt(i-diff) == '0')){
                    resBuilder[i+1] = carry ? '0':'1';
                }
                //1 and 0, carry remains the same (could technially do this in one statement but it would look FOUL).
                else if(b.charAt(i) == '0'){
                    resBuilder[i+1] = carry ? '0':'1';
                }
                //1 and 1
                else{
                    resBuilder[i+1] = carry ? '1':'0';
                    carry = true;
                }
            }
        }
        return resBuilder[0] == ' ' ? new String(resBuilder).substring(1):new String(resBuilder);
    }
}
