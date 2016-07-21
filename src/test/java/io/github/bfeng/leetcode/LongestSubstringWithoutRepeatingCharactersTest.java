package io.github.bfeng.leetcode;

import org.junit.Before;

/**
 * Created by bfeng on 7/18/16.
 */
public class LongestSubstringWithoutRepeatingCharactersTest extends GeneralTestSuite {

    @Before
    public void setUp() throws Exception {
        solution = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Override
    StringBuffer compute(StringBuffer input) {
        StringBuffer output = new StringBuffer();
        output.append(((LongestSubstringWithoutRepeatingCharacters) solution).lengthOfLongestSubstring(input.toString
                ()));
        return output;
    }
}