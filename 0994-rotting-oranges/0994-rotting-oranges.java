class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length,m=grid[0].length,fresh=0;
        Queue<int[]> q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int count=0;
        int[][] dir={{0,-1},{-1,0},{0,1},{1,0}};
        while(!(q.isEmpty()) && fresh>0){
            count++;
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] v=q.poll();
                for(int k=0;k<4;k++){
                    int rr=v[0]+dir[k][0];
                    int rc=v[1]+dir[k][1];
                    if((rr>=0 && rc>=0)&&(rr<n && rc<m)&& grid[rr][rc]==1){
                        fresh--;
                        grid[rr][rc]=2;
                        q.offer(new int[]{rr,rc});
                    }
                }
            }
        } 
        return fresh==0?count:-1;
    }
}