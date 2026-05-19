class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> st = new LinkedList<>();
        if(s.length() % 2 != 0)
        {
            return false;
        }
        for(char c : s.toCharArray())
        {
            if(c == '(' || c == '{' || c == '[')
            {
                st.addLast(c);
            }
            else
            {
                if(!st.isEmpty() && ((c == ')' && st.peekLast() == '(') || (c == '}' && st.peekLast() == '{') || (c == ']' && st.peekLast() == '[')))
                {
                    st.pollLast();
                }
                else
                {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
