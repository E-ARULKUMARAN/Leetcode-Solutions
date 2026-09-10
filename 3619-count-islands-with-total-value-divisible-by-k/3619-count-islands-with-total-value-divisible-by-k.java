class Solution {
    public int countIslands(int[][] grid, int k) {
        int n=grid.length,m=grid[0].length;
        Queue<int[]> q=new ArrayDeque<>();
        int[][] dir={{0,-1},{-1,0},{0,1},{1,0}};
        long sum=0;
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0){
                    sum+=grid[i][j];
                    grid[i][j]=0;
                    q.offer(new int[]{i,j});
                    while(!(q.isEmpty())){
                        int[] v=q.poll();
                        for(int l=0;l<4;l++){
                            int rr=v[0] + dir[l][0];
                            int rc=v[1] + dir[l][1];
                            if((rr>=0 && rc>=0) && (rr<n && rc<m) && grid[rr][rc]!=0){
                                sum+=grid[rr][rc];
                                grid[rr][rc]=0;
                                q.offer(new int[]{rr,rc});
                            }
                        }
                    }
                    if(sum%k==0){
                        res++;
                    }
                    sum=0;
                }
            }
        }
        return res;
    }
}