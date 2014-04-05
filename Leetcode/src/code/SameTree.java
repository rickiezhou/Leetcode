/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author Rickie
 */
public class SameTree {

//Definition for binary tree
    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return checkNode(p, q);
    }

    public boolean checkNode(TreeNode m, TreeNode n) {
        if (m == null && n == null) {
            return true;
        }
        if (m == null || n == null) {
            return false;
        }
        if (m.val != n.val) {
            return false;
        }
        return (checkNode(m.left, n.left) && checkNode(m.right, n.right));

    }

    //other solution
    public boolean isSameTree2(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        } else {
            return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}
