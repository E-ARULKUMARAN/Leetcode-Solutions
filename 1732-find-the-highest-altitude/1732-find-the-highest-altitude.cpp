class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int n=gain.size();
        vector<int>prefix(n);
        prefix[0]=gain[0];
        int res=gain[0]>0?gain[0]:0;
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+gain[i];
            if(prefix[i]>res)
            res=prefix[i];
        }
        return res;
    }
};