package io.github.bfeng.leetcode;

/**
 * Created by bfeng on 1/3/16.
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ListNode)) {
            return false;
        }
        ListNode current = this;
        ListNode target = (ListNode) obj;
        while (current != null && target != null) {
            if (current.val != target.val) {
                return false;
            }
            current = current.next;
            target = target.next;
        }
        return current == null && target == null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        ListNode p = this;
        while (p!=null) {
            stringBuilder.append(p.val);
            if(p.next != null) {
                stringBuilder.append("->");
            }
            p = p.next;
        }
        return stringBuilder.toString();
    }
}
