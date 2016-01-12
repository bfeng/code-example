package io.github.bfeng.leetcode;

/**
 * Created by bfeng on 1/3/16.
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return valid(root, null, null);
    }

    private boolean valid(TreeNode p, Integer low, Integer high) {
        return (p == null) ||
                ((low == null || p.val > low) && (high == null || p.val < high)
                        && valid(p.left, low, p.val)
                        && valid(p.right, p.val, high));
    }
}
