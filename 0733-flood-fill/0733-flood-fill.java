class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length,m=image[0].length;
        int source=image[sr][sc];
        image[sr][sc]=color;
        boolean[][] visited=new boolean[n][m];
        visited[sr][sc]=true;
        int[][] dir={{0,-1},{-1,0},{0,1},{1,0}};
        Queue<int[]> q=new ArrayDeque<>();
        q.offer(new int[]{sr,sc});
        while(!(q.isEmpty())){
            int[] v=q.poll();
            for(int k=0;k<4;k++){
                int rr=v[0]+dir[k][0];
                int rc=v[1]+dir[k][1];
                if((rr>=0 && rc>=0) && (rr<n && rc<m) && (image[rr][rc]==source && visited[rr][rc]==false)){
                    visited[rr][rc]=true;
                    image[rr][rc]=color;
                    q.offer(new int[]{rr,rc});
                }
            }
        }
        return image;
    }
}