package io.github.bfeng.leetcode.tools;

/**
 * Created by bfeng on 7/22/16.
 */
public class SolutionInfo {
    private String className;
    private String methodName;

    public SolutionInfo(String className, String methodName) {
        this.className = className;
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
