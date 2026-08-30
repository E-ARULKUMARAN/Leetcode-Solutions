class Solution {
    void dfs(int source,List<List<Integer>> l,boolean[] visited){
        visited[source]=true;
        for(int v:l.get(source)){
            if(!visited[v]){
                dfs(v,l,visited);
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            l.get(u).add(v);
            l.get(v).add(u);
        }
        boolean[] visited=new boolean[n];
        dfs(source,l,visited);
        return visited[destination];
    }
}