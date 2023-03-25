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




/*
if (ptn.equals(".*")) return true;
        char[] s = str.toCharArray(), p = ptn.toCharArray();
        int m = s.length, n = p.length;

        // left to right, add '' at the beginning, so dp[i+1][j+1] means match s[0, j] vs p[0, j]
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;

        for (int j = 0; j < n; j++) // fill i = 0
        dp[0][j+1] = p[j] == '*' && dp[0][j-1]; // "ab" vs "a*b*c*"

        for (int i = 0; i < m; i++) for (int j = 0; j < n; j++)
        if (p[j] == '*')
        dp[i+1][j+1] = dp[i+1][j-1] || // use '*' as 0 char, check back j-1(j-2 in p)
        match(s[i], p[j-1]) && dp[i][j+1]; // use '*' to match 1 more char, i must match j-1, s[0,i-1] must match p[0,j-1]
        else dp[i+1][j+1] = match(s[i], p[j]) && dp[i][j]; // normal match

        return dp[m][n];
        }

private boolean match(char a, char b) {
        return b == '.' || b == a;
        }
        }

/*
      ''      a      *      b      *      c      *      .
''[ true, false,  true, false,  true, false,  true, false]
 a[false,  true,  true, false,  true, false,  true,  true]
 b[false, false, false,  true,  true, false,  true,  true]
 x[false, false, false, false, false, false, false,  true]

      ''     m      i      s      *      i      s      *      i      p      *      .
''[ true, false, false, false, false, false, false, false, false, false, false, false]
 m[false,  true, false, false, false, false, false, false, false, false, false, false]
 i[false, false,  true, false,  true, false, false, false, false, false, false, false]
 s[false, false, false,  true,  true, false, false, false, false, false, false, false]
 s[false, false, false, false,  true, false, false, false, false, false, false, false]
 i[false, false, false, false, false,  true, false,  true, false, false, false, false]
 s[false, false, false, false, false, false,  true,  true, false, false, false, false]
 s[false, false, false, false, false, false, false,  true, false, false, false, false]
 i[false, false, false, false, false, false, false, false,  true, false,  true, false]
 p[false, false, false, false, false, false, false, false, false,  true,  true,  true]
 p[false, false, false, false, false, false, false, false, false, false,  true,  true]
 i[false, false, false, false, false, false, false, false, false, false, false,  true]
*/