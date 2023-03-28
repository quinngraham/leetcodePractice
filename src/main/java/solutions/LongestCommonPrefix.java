package solutions;

public class LongestCommonPrefix{
    public LongestCommonPrefix(){

    }

    public String solution(String[] strs){
        if(strs.length == 1 || strs[0].isEmpty())
            return strs[0];
        StringBuilder prefix = new StringBuilder();
        String worker;
        char checker = strs[0].charAt(0);
        int i = 0;
        while(true){
            worker = strs[i];
            if(worker.isEmpty() || worker.charAt(0) != checker)
                return prefix.toString();
            else{
                if(worker.length() == 1)
                    strs[i] = "";
                else
                    strs[i] = worker.substring(1);
            }
            if(i == strs.length-1 && !strs[0].isEmpty()){
                i = 0;
                prefix.append(checker);
                checker = strs[0].charAt(0);
            }
            else if(i+1 == strs.length && strs[0].isEmpty()){
                prefix.append(checker);
                return prefix.toString();
            }
            else
                i++;
        }
    }


    //this was close to my original implementation, however
    //i didn't realize that i could use indexOf like that
    //and instead tried to move backwards while comparing :(
    public String solution2(String[] strs){
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}
