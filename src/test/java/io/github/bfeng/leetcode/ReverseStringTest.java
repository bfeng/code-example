package io.github.bfeng.leetcode;

import org.junit.Before;

/**
 * Created by bfeng on 7/14/16.
 */
public class ReverseStringTest extends GeneralTestSuite {

    @Before
    public void setUp() throws Exception {
        solution = new ReverseString();
    }

    @Override
    StringBuffer compute(StringBuffer input) {
        StringBuffer output = new StringBuffer();
        output.append(((ReverseString) solution).reverseString(input.toString()));
        return output;
    }
}