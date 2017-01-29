package io.github.bfeng.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bfeng on 7/30/16.
 */
public class SerializeAndDeserializeBinaryTreeTest {

    SerializeAndDeserializeBinaryTree solution;

    @Before
    public void setUp() throws Exception {
        solution = new SerializeAndDeserializeBinaryTree();
    }

    @Test
    public void test() {
        String data = "[1,2,3,null,null,4,5]";

        assertEquals(data, solution.serialize(solution.deserialize(data)));
    }

}