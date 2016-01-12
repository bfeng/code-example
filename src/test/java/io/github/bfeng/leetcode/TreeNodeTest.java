package io.github.bfeng.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bfeng on 1/3/16.
 */
public class TreeNodeTest {

    @Test
    public void testToStringCase1() throws Exception {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        assertEquals("[1,2,3]", root1.toString());
    }

    @Test
    public void testToStringCase2() throws Exception {
        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);
        root2.right.left = new TreeNode(3);
        assertEquals("[1,null,2,3]", root2.toString());
    }
}