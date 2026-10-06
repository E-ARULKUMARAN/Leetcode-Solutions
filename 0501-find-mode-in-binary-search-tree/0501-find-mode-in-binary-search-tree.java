/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    void inOrder(TreeNode root,Map<Integer,Integer> res){
        if(root!=null){
            res.put(root.val,res.getOrDefault(root.val,0)+1);
            inOrder(root.left,res);
            inOrder(root.right,res);
        }
    }
    public int[] findMode(TreeNode root) {
        Map<Integer,Integer> mp=new HashMap<>();
        inOrder(root,mp);
        int m=Collections.max(mp.values());
        List<Integer> res=new ArrayList<>();
        for(Map.Entry<Integer,Integer> x: mp.entrySet()){
            if(x.getValue()==m){
                res.add(x.getKey());
            }
        }
        int n=res.size();
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            result[i]=res.get(i);
        }
        return result;
    }
}