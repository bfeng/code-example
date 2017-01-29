package io.github.bfeng.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by bfeng on 7/31/16.
 */
public class WordLadderII {
    public List<List<String>> findLadders(String beginWord, String endWord, Set<String> wordList) {
        getNextWords(beginWord, wordList);
        return null;
    }

    private List<String> getNextWords(String word, Set<String> wordList) {
        List<String> nextWords = new ArrayList<>();
        char[] wordArr = word.toCharArray();
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < wordArr.length; i++) {
                char tmp = wordArr[i];
                wordArr[i] = c;
                String s = new String(wordArr);
                if (!word.equals(s) && wordList.contains(s)) {
                    nextWords.add(s);
                }
                wordArr[i] = tmp;
            }
        }
        System.out.println(nextWords);
        return nextWords;
    }
}
