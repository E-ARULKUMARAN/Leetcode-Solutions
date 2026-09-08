class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),i);
        }
        int res=0;
        for(int i=0;i<t.length();i++){
            res+=Math.abs(i-mp.get(t.charAt(i)));
        }
        return res;
    }
}