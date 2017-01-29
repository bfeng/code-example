package io.github.bfeng.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by bfeng on 7/31/16.
 */
public class WordLadderIITest {

    WordLadderII solution;

    @Before
    public void setUp() throws Exception {
        solution = new WordLadderII();
    }

    @Test
    public void testFindLadders() throws Exception {
        String beginWord = "hit";
        String endWord = "cog";
        Set<String> wordList = new HashSet<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");

        List<List<String>> expected = new ArrayList<>();
        String[] l1 = {"hit", "hot", "dot", "dog", "cog"};
        String[] l2 = {"hit", "hot", "lot", "log", "cog"};
        expected.add(Arrays.asList(l1));
        expected.add(Arrays.asList(l2));

        assertListEquals(expected, solution.findLadders(beginWord, endWord, wordList));
    }

    private void assertListEquals(List<List<String>> expected, List<List<String>> ladders) {
        try {
            for (int i = 0; i < expected.size(); i++) {
                List<String> l = expected.get(i);
                for (int j = 0; j < l.size(); j++) {
                    assertEquals(l.get(j), ladders.get(i).get(j));
                }
            }
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }
}