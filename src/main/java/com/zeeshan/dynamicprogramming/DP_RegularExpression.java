package com.zeeshan.dynamicprogramming;

public class DP_RegularExpression {
    public static boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        // dp[i][j] means whether s[0..i-1] matches p[0..j-1]
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true; // empty string matches empty pattern

        // Handle patterns like a*, a*b*, a*b*c* that can match empty string
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }

        // Fill DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);

                if (pc == sc || pc == '.') {
                    // Direct match or '.' wildcard
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pc == '*') {
                    // '*' can mean zero occurrence or more occurrences
                    dp[i][j] = dp[i][j - 2]; // zero occurrence
                    char prev = p.charAt(j - 2);
                    if (prev == sc || prev == '.') {
                        dp[i][j] = dp[i][j] || dp[i - 1][j]; // one or more occurrence
                    }
                }
            }
        }

        return dp[m][n];

    }

    public static void main(String[] args) {
        String s1 = "aa";
        String p1 = "a";
        System.out.println(isMatch(s1, p1)); // false

        String s2 = "aa";
        String p2 = "a*";
        System.out.println(isMatch(s2, p2)); // true

        String s3 = "ab";
        String p3 = ".*";
        System.out.println(isMatch(s3, p3)); // true

        String s4 = "aab";
        String p4 = "c*a*b";
        System.out.println(isMatch(s4, p4)); // true

        String s5 = "mississippi";
        String p5 = "mis*is*p*.";
        System.out.println(isMatch(s5, p5)); // false
    }

}
