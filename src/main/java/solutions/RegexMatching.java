package solutions;

public class RegexMatching{
    public RegexMatching(){
        /*
        This is a bad implementation, I could take a bunch of time and figure out how to implement
        a dynamically programmed solution using caching, but I don't think I'm getting a question like this
        on an interview. This seems to be more of a senior dev question.
         */

    }

    public boolean solution(String s, String p){
        return solRec(s, p);
    }

    public boolean solRec(String text, String pattern ){
        if(text.isEmpty() && pattern.isEmpty())
            return true;
        else if(pattern.isEmpty())
            return false;

        boolean firstMatch = !text.isEmpty() && (pattern.charAt(0) == '.' || pattern.charAt(0) == text.charAt(0));
        if(pattern.length() >= 2 && pattern.charAt(1) == '*')
            return solRec(text, pattern.substring(2)) ||
                    (firstMatch && solRec(text.substring(1), pattern));
        else
            return firstMatch && solRec(text.substring(1), pattern.substring(1));

    }
}