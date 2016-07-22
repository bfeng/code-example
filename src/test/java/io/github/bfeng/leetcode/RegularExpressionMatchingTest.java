package io.github.bfeng.leetcode;


import io.github.bfeng.leetcode.tools.GeneralTestSuite;
import org.junit.Before;

public class RegularExpressionMatchingTest extends GeneralTestSuite {

    @Before
    public void setUp() throws Exception {
        solution = new RegularExpressionMatching();
    }

    @Override
    protected StringBuffer compute(StringBuffer input) {
        StringBuffer output = new StringBuffer();
        String[] inputArray = input.toString().split("\n");
        output.append(((RegularExpressionMatching) solution).isMatch(inputArray[0], inputArray[1]));
        return output;
    }
}