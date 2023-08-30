package org.example.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/group-anagrams/
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */
public class GroupAnagramsImpl
{
    /**
     * Constraints:
     * <p>
     * 1 <= strs.length <= 104
     * 0 <= strs[i].length <= 100
     * strs[i] consists of lowercase English letters.
     */
    public static List<List<String>> groupAnagrams(String[] strs)
    {
        Map<String, List<String>> sorted = Arrays.stream(strs)
                .collect(Collectors.groupingBy(str ->
                {
                    char[] charArray = str.toCharArray();
                    Arrays.sort(charArray);
                    return new String(charArray);
                }));
        return new ArrayList<>(sorted.values());
    }
}
