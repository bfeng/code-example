package io.github.bfeng.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by bfeng on 1/9/16.
 */
public class LetterCombinationOfAPhoneNumber {
    static Map<Character, String> map = new HashMap<>();

    static {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<>();
        String tmp;
        for (int i = 0; i < digits.length(); i++) {
            String chars = map.get(digits.charAt(i));
            if (results.size() > 0) {
                List<String> clone = new ArrayList<>(results.size());
                for (String each : results) {
                    clone.add(each);
                }
                results.clear();
                for (int j = 0; j < clone.size(); j++) {
                    tmp = clone.get(j);
                    for (int k = 0; k < chars.length(); k++) {
                        results.add(tmp + chars.charAt(k));
                    }
                }
            } else {
                for (int k = 0; k < chars.length(); k++) {
                    results.add(Character.toString(chars.charAt(k)));
                }
            }
        }
        return results;
    }
}
