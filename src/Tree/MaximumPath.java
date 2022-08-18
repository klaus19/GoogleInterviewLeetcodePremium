package Tree;

//Maximum Path Sum in a Binary Tree

//O(n) because the Tree is used.

//we have used Recursion

public class MaximumPath {

      int max_path_sum;
      public int maxPathSum(Node root){
            max_path_sum = Integer.MIN_VALUE;
         pathSum(root);
        return max_path_sum;
      }

      public int pathSum(Node root){

        if (root==null) return 0;

        int left = Math.max(0,pathSum(root.left));
        int right = Math.max(0,pathSum(root.right));
         max_path_sum = Math.max(max_path_sum,left+right+root.val);
        return Math.max(left,right)+root.val;

      }
}
