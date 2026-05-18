class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("\\s", "").toLowerCase();

        int l = 0, r = str.length() - 1;

        while(l < r)
        {
            while(l < r && !Character.isLetterOrDigit(str.charAt(l)))
            {
                l++;
            }
            while(r > l && !Character.isLetterOrDigit(str.charAt(r)))
            {
                r--;
            }

            if(str.charAt(l) != str.charAt(r))
            {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}
