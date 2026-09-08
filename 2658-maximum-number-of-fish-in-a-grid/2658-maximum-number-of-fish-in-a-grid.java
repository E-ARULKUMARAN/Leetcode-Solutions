class Solution {
    public int findMaxFish(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        Queue<int[]> q=new ArrayDeque<>();
        int[][] dir={{0,-1},{-1,0},{0,1},{1,0}};
        int sum=0,res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0){
                    sum+=grid[i][j];
                    grid[i][j]=0;
                    q.offer(new int[]{i,j});
                    while(!(q.isEmpty())){
                        int[] v=q.poll();
                        for(int k=0;k<4;k++){
                            int rr=v[0] + dir[k][0];
                            int rc=v[1] + dir[k][1];
                            if((rr>=0 && rc>=0) && (rr<n && rc<m) && grid[rr][rc]!=0){
                                sum+=grid[rr][rc];
                                grid[rr][rc]=0;
                                q.offer(new int[]{rr,rc});
                            }
                        }
                    }
                }
                res=Math.max(res,sum);
                sum=0;
            }
        }
        return res;
    }
}