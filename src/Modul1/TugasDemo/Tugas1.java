package Modul1.TugasDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tugas1 {

    public static void main(String[] args) {
        List<String> buah = Arrays.asList("apel", "pisang", "kiwi", "anggur", "semangka");

        System.out.println("Total huruf: " + calculateTotalLength(buah));
        System.out.println("Kata terpanjang: " + findLongestWord(buah));
        System.out.println("Daftar kata dalam huruf kapital: " + capitalizeWords(buah));
        System.out.println("Panjang masing-masing kata: " + wordLengths(buah));
    }


    public static int calculateTotalLength(List<String> words) {
        if (words == null) {
            throw new IllegalArgumentException("List tidak boleh null");
        }

        int totalLength = 0;
        for (String word : words) {
            if (word != null) {
                totalLength += word.length();
            }
        }
        return totalLength;
    }


    public static String findLongestWord(List<String> words) {
        if (words == null || words.isEmpty()) {
            throw new IllegalArgumentException("List kosong atau null");
        }

        String longestWord = "";
        for (String word : words) {
            if (word != null && word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }


    public static List<String> capitalizeWords(List<String> words) {
        if (words == null) {
            throw new IllegalArgumentException("List tidak boleh null");
        }

        List<String> capitalized = new ArrayList<>();
        for (String word : words) {
            if (word != null) {
                capitalized.add(word.substring(0,1).toUpperCase() + word.substring(1));
            }
        }
        return capitalized;
    }


    public static List<Integer> wordLengths(List<String> words) {
        if (words == null) {
            throw new IllegalArgumentException("List tidak boleh null");
        }
        List<Integer> lengths = new ArrayList<>();
        for (String word : words) {
            if (word != null) {
                lengths.add(word.length());
            }
        }
        return lengths;
    }
}
