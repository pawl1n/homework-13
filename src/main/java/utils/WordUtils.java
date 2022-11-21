package utils;

import exceptions.EmptyListException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordUtils {

    private WordUtils() {}

    public static String getShortestWord(List<String> words) throws EmptyListException {
        if (words.isEmpty()) throw new EmptyListException();

        String shortest = words.get(0);

        for (int i = 1; i < words.size(); i++) {
            if (words.get(i).length() < shortest.length()) {
                shortest = words.get(i);
            }
        }

        return shortest;
    }

    public static Map<String, Integer> getCountOfWordsOccurrences(String sentence) {
        Map<String, Integer> countOfOccurrences = new HashMap<>();

        String[] words = sentence.trim().toLowerCase().split(" ");

        for (String word: words) {
            if (!word.isBlank()) {
                if (countOfOccurrences.containsKey(word)) {
                    countOfOccurrences.replace(word, countOfOccurrences.get(word) + 1);
                } else {
                    countOfOccurrences.put(word, 1);
                }
            }
        }

        return countOfOccurrences;
    }
}
