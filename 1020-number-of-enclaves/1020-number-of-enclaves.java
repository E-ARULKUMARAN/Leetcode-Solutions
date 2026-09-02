class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int[][] dir={{0,1},{1,0},{0,-1},{-1,0}};
        Queue<int[]> q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i==0 || j==0 || i==n-1 || j==m-1) && grid[i][j]==1){
                    grid[i][j]=0;
                    q.offer(new int[]{i,j});
                    while(!(q.isEmpty())){
                        int[] v=q.poll();
                        for(int k=0;k<4;k++){
                            int rr=v[0] + dir[k][0];
                            int rc=v[1] + dir[k][1];
                            if((rr>=0 && rc>=0) && (rr<n && rc<m) && grid[rr][rc]==1){
                                grid[rr][rc]=0;
                                q.offer(new int[]{rr,rc});
                            }
                        }
                    }
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}