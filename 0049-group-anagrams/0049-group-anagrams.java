class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        int n = strs.length;
        Map<String, List<String>> mp = new HashMap<>();
        for(String entry:strs){
            char[] ch=entry.toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            if(!mp.containsKey(s)){
                mp.put(s,new ArrayList<>());
            }
                
                mp.get(s).add(entry);
        }
        for(List<String> x:mp.values()){
            res.add(x);
        }
        return res;
    }
}