package com.zeeshan.arrays;

import java.util.Arrays;

public class CompletingWord {
    public static void main(String[] args) {
        String licensePlate = "1s3 PSt";
        String[] words = {"step", "steps", "stripe", "stepple"};
        CompletingWord solution = new CompletingWord();
        System.out.println(solution.shortestCompletingWord(licensePlate, words));
    }

    public String shortestCompletingWord(String licensePlate, String[] words) {

        int[] targetCharCount = charCount(licensePlate.toLowerCase());
        String shortestWord = "";

        for (String word : words) {
            if ((shortestWord.length() == 0 || word.length() < shortestWord.length())
                    && isCompletingWord(word, targetCharCount)) {
                shortestWord = word;
            }
        }

        return shortestWord;
    }

    private boolean isCompletingWord(String word, int[] targetCharCount) {
        int[] wordCharCount = charCount(word);
        for (int i = 0; i < 26; i++) {
            System.out.println("word: "+ wordCharCount[i]+" taget: "+ targetCharCount[i]);
            if (wordCharCount[i] < targetCharCount[i]) {
                return false;
            }
        }
        return true;
    }

    private int[] charCount(String word) {
        int[] count = new int[26];
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                count[c - 'a']++;
            }
        }
        System.out.println(Arrays.toString(count));
        return count;
    }
}
