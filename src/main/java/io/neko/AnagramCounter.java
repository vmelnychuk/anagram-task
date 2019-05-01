package io.neko;

import io.neko.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramCounter {
    public Map<String, Integer> countAnagrams(final List<String> input) {
        if (input == null || input.size() == 0) {
            throw new IllegalArgumentException("Please provide not null or empty input list");
        }

        Map<String, List<String>> anagrams = new HashMap<>();
        for (String word: input) {
            String sortedWord = StringUtils.sort(word);
            if (!anagrams.containsKey(sortedWord)) {
                List<String> wordList = new ArrayList<>();
                wordList.add(word);
                anagrams.put(sortedWord, wordList);
            } else {
                List<String> wordList = anagrams.get(sortedWord);
                wordList.add(word);
            }
        }

        Map<String, Integer> result = new HashMap<>();
        for (String word: input) {
            String sortedWord = StringUtils.sort(word);
            List<String> words = anagrams.get(sortedWord);
            int count = words.size() - 1;
            result.put(word, count);
        }

        return result;
    }
}
