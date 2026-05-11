class Solution {

    public String encode(List<String> strs) {
        String res = "";

        for(String str : strs)
        {
            res += str.length() + "#" + str;
        }

        System.out.println(res);
        return res;
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < str.length())
        {
            String num = "";
            while(str.charAt(i) != '#')
            {
                num += str.charAt(i);
                i++;
            }
            i++;

            int n = Integer.parseInt(num);
            String s = "";
            while(n > 0)
            {
                s += str.charAt(i);
                i++;
                n--;
            }

            res.add(s);
        }

        return res;
    }
}
