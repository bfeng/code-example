package io.github.bfeng.leetcode;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by bfeng on 1/22/16.
 */
public class Utils {
    public static <T> boolean equalsWithoutOrder(Collection<T> l1, Collection<T> l2) {
        if (l1.size() != l2.size())
            return false;
        Collection<T> similar = new HashSet<>(l1);
        Collection<T> different = new HashSet<>();
        different.addAll(l1);
        different.addAll(l2);
        similar.retainAll(l2);
        different.removeAll(similar);
        return different.size() == 0;
    }
}
