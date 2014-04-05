/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author Rickie
 */
public class MaxdepthofBST {
   
 //Definition for binary tree
 public class TreeNode {
    int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
  }
 

 
    public int maxDepth(TreeNode root) {
        if (root==null) {return 0;} 
        else if (root.left==null&&root.right==null){return 1;}
        else{return calculateheight(root);}
    }
    
    public int calculateheight(TreeNode n){
        if (n == null) {
            return 0;
        } else {
            return 1 + Math.max(calculateheight(n.left),
                    calculateheight(n.right));
        }
        
    }

}
