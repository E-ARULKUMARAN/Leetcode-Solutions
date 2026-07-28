class Solution {
    public String smallestPalindrome(String s) {
        TreeMap<Character, Integer> freq = new TreeMap<>();
        for (char x : s.toCharArray()) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        StringBuilder half = new StringBuilder();
        char ch = 'a';
        int flag = 0;
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                flag = 1;
                ch = entry.getKey();
            }
            int frequency=entry.getValue();
            for (int i = 0; i < frequency/2; i++) {
                half.append(entry.getKey());
            }
        }
        StringBuilder res=new StringBuilder(half);
        res.append(half.reverse());
        int mid=res.length()/2;
        if (flag == 1) {
            res.insert(mid,ch);
        }
        return res.toString();
    }
}