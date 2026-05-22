package basicPrograms;

public class LongestCommonSubstring {
	
	public static int findMaxLength(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        
        // Create a DP table to store lengths of common suffixes
        int[][] dp = new int[m + 1][n + 1];
        int maxLength = 0; // To store the maximum length found
        
        // Build the table in bottom-up manner
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If characters at current positions match
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxLength = Math.max(maxLength, dp[i][j]);
                } else {
                    // Reset if characters don't match (must be contiguous)
                    dp[i][j] = 0;
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "abcdfce";
        
        System.out.println("Max length of common substring: " + findMaxLength(str1, str2));
        // Example Output: 2 (Common substring is "ab")
    }

}
