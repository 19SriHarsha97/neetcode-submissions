class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2)
        {
            return s.length();
        }

        int l = 0;
        int r = 0;

        int res = 1;

        int n = s.length();

        HashSet<Character> set = new HashSet<>();

        while(r < n)
        {
            char c = s.charAt(r);
            if(!set.contains(c))
            {
                set.add(c);
                System.out.println("Added " + c);
                r++;
                continue;
            }
            else
            {
                res = Math.max(res, set.size());
                while(l < r)
                {
                    if(s.charAt(l) == c)
                    {
                        set.remove(c);
                        l++;
                        break;
                    }
                    else
                    {
                        set.remove(s.charAt(l));
                        l++;
                    }
                }
            }
        }
        return Math.max(res, set.size());
    }
}
