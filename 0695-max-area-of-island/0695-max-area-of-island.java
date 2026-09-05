class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int res=0,count=0;
        int[][] dir={{0,-1},{-1,0},{0,1},{1,0}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    count=1;
                    grid[i][j]=0;
                    Queue<int[]> q=new ArrayDeque<>();
                    q.offer(new int[]{i,j});
                    while(!(q.isEmpty())){
                        int[] v=q.poll();
                        for(int k=0;k<4;k++){
                            int rr=v[0]+dir[k][0];
                            int rc=v[1]+dir[k][1];
                            if((rr>=0 && rc>=0) && (rr<n && rc<m) && grid[rr][rc]==1){
                                count++;
                                grid[rr][rc]=0;
                                q.offer(new int[]{rr,rc});
                            }
                        }
                    }
                }
                res=Math.max(count,res);
            }
        }
        return res;
    }
}