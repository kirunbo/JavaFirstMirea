package ru.mirea.task13.no6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static String getLine(List<String> words) {
        StringBuilder result = new StringBuilder();
        List<String> usedWords = new ArrayList<>();

        if (!words.isEmpty()) {
            String currentWord = words.get(0);
            usedWords.add(currentWord);
            result.append(currentWord);

            while (true) {
                String nextWord = null;
                for (String word : words) {
                    if (!usedWords.contains(word) &&
                            Character.toLowerCase(currentWord.charAt(currentWord.length() - 1))
                                    == Character.toLowerCase(word.charAt(0))) {
                        nextWord = word;
                        break;
                    }
                }
                if (nextWord == null) {
                    break;
                }
                usedWords.add(nextWord);
                result.append(" ").append(nextWord);
                currentWord = nextWord;
            }
        }
        return result.toString();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input word separated by spaces: ");
        String input = scanner.nextLine();
        List<String> words = Arrays.asList(input.split(" "));
        String res = getLine(words);
        System.out.println("result: "+ res);
    }
}
