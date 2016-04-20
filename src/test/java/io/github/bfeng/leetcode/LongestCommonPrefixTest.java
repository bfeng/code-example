package io.github.bfeng.leetcode;

import org.junit.Before;

public class LongestCommonPrefixTest extends GeneralTestSuite {

    LongestCommonPrefix solution;

    @Before
    public void setUp() throws Exception {
        solution = new LongestCommonPrefix();
    }

    @Override
    StringBuffer compute(StringBuffer input) {
        StringBuffer output = new StringBuffer();
        String[] inputArray = input.toString().split(",.+?");
        output.append(solution.longestCommonPrefix(inputArray));
        return output;
    }
}