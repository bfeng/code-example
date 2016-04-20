package io.github.bfeng.leetcode;

/**
 * Created by bfeng on 4/17/16.
 */
public class TestAlgorithmTest extends GeneralTestSuite {
    @Override
    StringBuffer compute(StringBuffer input) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(new TestAlgorithm().alwaysTrue());
        return stringBuffer;
    }
}
