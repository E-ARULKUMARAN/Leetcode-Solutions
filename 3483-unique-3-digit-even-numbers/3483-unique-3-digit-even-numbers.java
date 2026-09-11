class Solution {
    public int totalNumbers(int[] digits) {
        int res=0,n=digits.length;
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                for(int k=0;k<n;k++){
                    if(k==j || k==i){
                        continue;
                    }
                    int num=digits[i]*100 + digits[j]*10 + digits[k];
                    if((digits[i]!=0 && num%2==0 ) && !st.contains(num)){
                        res++;
                        st.add(num);
                    }
                }
            }
        }

        return res;
    }
}