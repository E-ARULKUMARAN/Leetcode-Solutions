class Solution {
    public boolean checkValidGrid(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        Queue<int[]> q=new ArrayDeque<>();
        q.offer(new int[]{0,0,grid[0][0]});
        int[][] dir={{2,1},{2,-1},{1,2},{1,-2},{-1,2},{-1,-2},{-2,1},{-2,-1}};
        int k=1;
        while(!(q.isEmpty())){
            int[] v=q.poll();
            for(int i=0;i<8;i++){
                int rr=v[0] + dir[i][0];
                int rc=v[1] + dir[i][1];
                if((rr>=0 && rc>=0) && (rr<n && rc<m) && grid[rr][rc]==v[2]+1){
                    q.offer(new int[]{rr,rc,grid[rr][rc]});
                    k++;
                }
            }
        }
        return k==n*m;
    }
}