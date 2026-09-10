class Solution {
    boolean check(String p,int i,int j,int[] fre){
        for(i=i;i<=j;i++){
            fre[p.charAt(i)-'a']--;
            if(fre[p.charAt(i)-'a']<0){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length(),m=p.length();
        List<Integer> res=new ArrayList<>();
        int[] fre=new int[26];
        Arrays.fill(fre,0);
        for(int i=0;i<m;i++){
            fre[p.charAt(i)-'a']++;
        }
        int l=0;
        for(int r=0;r<n;r++){
            if((r-l+1)==m){
                int[] fre1=Arrays.copyOf(fre,fre.length);
                if(check(s,l,r,fre1)){
                    res.add(l);
                }
                l++;
            }
        }
        return res;
    }
}