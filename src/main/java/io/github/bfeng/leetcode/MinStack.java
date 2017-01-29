package io.github.bfeng.leetcode;

import java.util.Stack;

/**
 * Created by bfeng on 7/28/16.
 */
public class MinStack {

    //声明数据栈
    private Stack<Integer> elementsStack = new Stack<Integer>();
    //声明辅助栈
    private Stack<Integer> supportStack = new Stack<Integer>();

    /**
     * 考虑到时间复杂度的需求，添加一个辅助栈，
     * 每次入栈时将元素分别存入数据栈和辅助栈，
     * 辅助栈中的数据始终保持最小值在栈顶，需要获取最小值时，直接Peek()辅助栈即可。
     */
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        //以下测试用例
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }

    public void push(int x) {
        //始终保持辅助栈顶是最小元素
        if (supportStack.empty() || x <= supportStack.peek()) {
            supportStack.push(x);
        }
        elementsStack.push(x);
    }

    public void pop() {
        //更新辅助栈
        if (elementsStack.peek().equals(supportStack.peek())) {
            supportStack.pop();
        }
        elementsStack.pop();
    }

    public int top() {
        return elementsStack.peek();
    }

    public int getMin() {
        //辅助栈
        return supportStack.peek();
    }

}
