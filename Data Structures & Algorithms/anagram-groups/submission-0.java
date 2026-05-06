class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>();
        for(String str : strs)
        {
            int [] freq = new int[26];

            for(char c : str.toCharArray())
            {
                freq[c - 'a'] += 1;
            }

            String key = Arrays.toString(freq);

            if(!groups.containsKey(key))
            {
                groups.put(key, new ArrayList<String>());
            }

            groups.get(key).add(str);
        }

        return new ArrayList<>(groups.values());
    }
}
