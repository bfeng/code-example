package io.github.bfeng.leetcode;

/**
 * Created by bfeng on 7/30/16.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreNode(int x) {val=x;}
 * }
 */

public class SerializeAndDeserializeBinaryTree {

    //Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root != null) {
            queue.add(root);
        }

        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();

            if (node != null) {
                values.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            } else
                values.add(null);
        }

        for (int i = values.size() - 1; i > 0; i--) {
            if (values.get(i) == null) {
                values.remove(i);
            } else {
                break;
            }
        }

        StringBuilder builder = new StringBuilder();
        builder.append('[');
        for (int i = 0; i < values.size(); i++) {
            builder.append(values.get(i));
            if (i < values.size() - 1)
                builder.append(',');
        }
        builder.append(']');

        return builder.toString();
    }

    //Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        data = data.substring(1, data.length() - 1);

        String[] array = data.split(",");
        TreeNode root = null;
        Queue<Integer> input = new LinkedList<>();
        for (String each : array) {
            if ("null".equals(each))
                input.add(null);
            else
                input.add(Integer.parseInt(each));
        }

        Queue<TreeNode> queue = new LinkedList<>();

        root = new TreeNode(input.remove());
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (input.size() > 0) {
                Integer i = input.remove();
                if (i != null) {
                    node.left = new TreeNode(i);
                    queue.add(node.left);

                }
            }

            if (input.size() > 0) {
                Integer i = input.remove();
                if (i != null) {
                    node.right = new TreeNode(i);
                    queue.add(node.right);
                }
            }
        }

        return root;
    }
}
