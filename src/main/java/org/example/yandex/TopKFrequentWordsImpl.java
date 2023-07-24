package org.example.yandex;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Given an array of strings words and an integer k, return the k most frequent strings.
 * Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.
 */
public class TopKFrequentWordsImpl
{

    /**
     * 1 <= words.length <= 500
     * 1 <= words[i].length <= 10
     * words[i] consists of lowercase English letters.
     * k is in the range [1, The number of unique words[i]]
     */
    public static List<String> topKFrequent(String[] words, int k)
    {
        return Stream.of(words)
                .collect(Collectors.groupingBy(key -> key, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
