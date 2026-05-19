class Solution {
    public int evalRPN(String[] tokens) {
        LinkedList<Integer> st = new LinkedList<>();
        for(String token : tokens)
        {
            if(Character.isDigit(token.charAt(token.length() - 1)))
            {
                st.addLast(Integer.parseInt(token));
            }
            else
            {
                int op2 = st.pollLast();
                int op1 = st.pollLast();
                
                if(token.equals("+"))
                {
                    st.addLast(op1 + op2);
                }
                else if(token.equals("-"))
                {
                    st.addLast(op1 - op2);
                }
                else if(token.equals("*"))
                {
                    st.addLast(op1 * op2);
                }
                else
                {
                    st.addLast(op1 / op2);
                }
            }
        }

        return st.pollLast();
    }
}
