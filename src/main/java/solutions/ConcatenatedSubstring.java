package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ConcatenatedSubstring{

    public ConcatenatedSubstring(){

    }


    public List<Integer> solution(String s, String[] words){
        List<Integer> ret = new ArrayList<>();
        if(s.length() < (words.length * words[0].length()))
            return ret;
        StringBuilder build = new StringBuilder();
        HashMap<String, Integer> wordsChecker = new HashMap<>();
        for(String word : words){
            build.append(word.charAt(0));
            if(wordsChecker.containsKey(word))
                wordsChecker.put(word, wordsChecker.get(word) + 1);
            else
                wordsChecker.put(word, 1);
        }
        String checker = build.toString();
        boolean contains;
        for(int i = 0; i < s.length(); i++){
            if(i+(words.length*words[0].length()) > s.length())
                return ret;
            contains = checker.contains(s.charAt(i) + "");
            if(contains && i + (words.length*words[0].length()) < s.length()){
                if(helperFunction(s.substring(i, words.length*words[0].length()+i), words, wordsChecker))
                    ret.add(i);
            }
            else if(contains && i + (words.length*words[0].length()) == s.length()){
                if(helperFunction(s.substring(i), words, wordsChecker))
                    ret.add(i);
            }
        }
        return ret;
    }

    public boolean helperFunction(String check, String[] words, HashMap<String, Integer> wordsChecker){
        HashMap<String, Integer> checker = new HashMap<>();
        boolean finalCheck = false;
        int idx = 0, idx2 = words[0].length();
        String worker;
        while(idx2 <= check.length()){
            for(String word : words){
                worker = idx2 == check.length() ? check.substring(idx) : check.substring(idx, idx2);
                if(worker.equals(word) && !checker.containsKey(word)){
                    checker.put(word, 1);
                    finalCheck = true;
                    break;
                }
                else if(worker.equals(word) && wordsChecker.get(word)-checker.get(word) > 0){
                    checker.put(word, checker.get(word) +1);
                    finalCheck = true;
                    break;
                }
                else if(worker.equals(word) && wordsChecker.get(word)-checker.get(word) <= 0)
                    return false;
                else
                    finalCheck = false;

            }
            if(!finalCheck)
                return finalCheck;
            idx += words[0].length();
            idx2 = idx + words[0].length();
        }
        return finalCheck;
    }
}
