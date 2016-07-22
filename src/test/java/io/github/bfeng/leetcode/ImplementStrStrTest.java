package io.github.bfeng.leetcode;

import io.github.bfeng.leetcode.tools.GeneralTestSuite;
import org.junit.Before;

/**
 * Created by bfeng on 7/18/16.
 */
public class ImplementStrStrTest extends GeneralTestSuite {

    @Before
    public void setUp() throws Exception {
        solution = new ImplementStrStr();
    }

    @Override
    protected StringBuffer compute(StringBuffer input) {
        StringBuffer output = new StringBuffer();
        String[] inputArray = input.toString().split("\n");
        output.append(((ImplementStrStr) solution).strStr(inputArray[0], inputArray[1]));
        return output;
    }
}