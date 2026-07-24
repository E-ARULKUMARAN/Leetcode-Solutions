class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length;
        int l=0,h=n-1,ans=0;
        while(l<=h){
            int mid=l+((h-l)>>1);
            if(letters[mid]-'a'>target-'a'){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return letters[ans];

    }
}