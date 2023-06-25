package solutions;

public class FirstOccurString{
    public FirstOccurString(){

    }


    //yes i know i can just use indexOf here lol i wanted to try it myself
    //code would just be 'return haystack.indexOf(needle);
    public int solution(String haystack, String needle){
        int len = needle.length();
        if(len > haystack.length())
            return -1;
        String sub;
        for(int i = 0; i <= haystack.length()-len; i++){
            if(i+len == haystack.length())
                sub = haystack.substring(i);
            else
                sub = haystack.substring(i, i+len);
            if(sub.equals(needle))
                return i;
        }
        return -1;
    }
}
