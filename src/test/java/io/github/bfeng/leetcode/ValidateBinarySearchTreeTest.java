package io.github.bfeng.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bfeng on 1/3/16.
 */
public class ValidateBinarySearchTreeTest {

    ValidateBinarySearchTree solution;

    @Before
    public void setUp() throws Exception {
        solution = new ValidateBinarySearchTree();
    }

    @Test
    public void testIsValidBSTCase1() throws Exception {
        TreeNode root1 = new TreeNode(30);
        root1.left = new TreeNode(10);
        root1.right = new TreeNode(20);
        root1.left.left = new TreeNode(50);
        root1.right.left = new TreeNode(45);
        root1.right.right = new TreeNode(35);

        assertEquals(false, solution.isValidBST(root1));
    }

    @Test
    public void testIsValidBSTCase2() throws Exception {
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.right.left = new TreeNode(4);
        root2.right.left.right = new TreeNode(5);

        assertEquals(false, solution.isValidBST(root2));
    }

    @Test
    public void testIsValidBSTCase3() throws Exception {
        TreeNode root = null;

        assertEquals(true, solution.isValidBST(root));
    }

    @Test
    public void testIsValidBSTCase4() throws Exception {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);

        assertEquals(true, solution.isValidBST(root));
    }

    @Test
    public void testIsValidBSTCase5() throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);

        assertEquals(false, solution.isValidBST(root));
    }

    @Test
    public void testIsValidBSTCase6() throws Exception {
        TreeNode root = new TreeNode(Integer.MAX_VALUE);

        assertEquals(true, solution.isValidBST(root));
    }

    @Test
    public void testIsValidBSTCase7() throws Exception {
        TreeNode root = new TreeNode(Integer.MIN_VALUE);

        assertEquals(true, solution.isValidBST(root));
    }

    @Test
    public void testIsValidBSTCase8() throws Exception {
        TreeNode root = new TreeNode(Integer.MAX_VALUE);
        root.left = new TreeNode(Integer.MIN_VALUE);

        assertEquals(true, solution.isValidBST(root));
    }

    @Test
    public void testIsValidBSTCase9() throws Exception {
        TreeNode root = new TreeNode(Integer.MAX_VALUE);
        root.left = new TreeNode(Integer.MAX_VALUE);

        assertEquals(false, solution.isValidBST(root));
    }
}