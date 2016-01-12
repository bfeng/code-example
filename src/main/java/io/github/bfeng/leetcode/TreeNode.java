package io.github.bfeng.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by bfeng on 1/3/16.
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        this.val = x;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(this);
        builder.append('[');
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            builder.append(node.val);
            builder.append(',');
            if (node.left != null) {
                queue.add(node.left);
            } else if (node.right != null) {
                builder.append("null,");
            }
            if(node.right != null) {
                queue.add(node.right);
            }
        }
        builder.deleteCharAt(builder.length()-1);
        builder.append(']');
        return builder.toString();
    }
}
