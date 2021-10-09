package com.cristian.lab3;

import java.util.*;

public class TextManipulation {
    public String text;

    public TextManipulation() {
        this.text = "";
    }

    public int getWords() {
        int count = 0;
        char[] ch = new char[this.text.length()];

        for (int i = 0; i < this.text.length(); i++) {
            ch[i] = this.text.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                count++;
        }
        return count;
    }

    public int getSentences() {
        return this.text.split("[^.?!]+").length - 1;
    }

    public int getLetters() {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i)))
                count++;
        }
        return count;
    }

    public int getVowels() {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.toLowerCase().charAt(i) == 'a'
                    || text.toLowerCase().charAt(i) == 'e'
                    || text.toLowerCase().charAt(i) == 'i'
                    || text.toLowerCase().charAt(i) == 'u'
                    || text.toLowerCase().charAt(i) == 'o')
                count++;
        }
        return count;
    }

    public int getConsonants() {
        return this.getLetters() - this.getVowels();
    }

    public String getLongestWord() {
        String[] words = this.text.split("[\s.,;?!]+"); // splitting string in array of substrings (words)
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }
        int maxLength = -1;
        String longestWord = "";
        for (String a : words) {
            if (a.length() >= maxLength) {
                maxLength = a.length();
                longestWord = a;
            }
        }
        return longestWord;
    }

    public List<String> topWords() {
        String[] words = this.text.split("[\s.,;?!]+");
        Map<String, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }

        Map<String, Integer> count = new HashMap<>();
        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<String> maxHeap = new PriorityQueue<>(
                (str1, str2) -> {
                    if (count.get(str1).equals(count.get(str2))) {
                        return str1.compareTo(str2);
                    } else {
                        return -Integer.compare(count.get(str1), count.get(str2));
                    }
                });
        maxHeap.addAll(count.keySet());
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            result.add(maxHeap.remove());
        }
        return result;
    }
}
