package io.github.bfeng.leetcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bfeng on 1/3/16.
 */
public class MergeTwoSortedListsTest {

    MergeTwoSortedLists solution;

    @Before
    public void setUp() throws Exception {
        solution = new MergeTwoSortedLists();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testMergeTwoLists() throws Exception {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(4);
        expected.next.next.next.next = new ListNode(5);

        assertEquals(expected, solution.mergeTwoLists(l1, l2));
    }
}