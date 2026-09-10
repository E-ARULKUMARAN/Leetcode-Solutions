class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> edge=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            edge.add(new ArrayList<>());
        }
        int[] incoming=new int[numCourses];
        for(int[] x : prerequisites){
            edge.get(x[1]).add(x[0]);
            incoming[x[0]]++;
        }
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=0;i<numCourses;i++){
            if(incoming[i]==0){
                q.offer(i);
            }
        }
        int k=0;
        while(!q.isEmpty()){
            int u=q.poll();
            k++;
            for(int i=0;i<edge.get(u).size();i++){
                incoming[edge.get(u).get(i)]--;
                if(incoming[edge.get(u).get(i)]==0){
                    q.offer(edge.get(u).get(i));
                }
            }
        }
        return k==numCourses;
    }
}