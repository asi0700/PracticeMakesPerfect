package tasks;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class WordCounter {
    public static void analiz(String inputFilename,  String outputFilename) {
         inputFilename = "E:\\JavaProjects\\practiceMakesPerfect\\src\\tasks\\avidreaders.ruDubrovskiy.txt";
         outputFilename = "E:\\JavaProjects\\practiceMakesPerfect\\src\\tasks\\rezultat1.txt";

        try {
            Map<String, Integer> wordCount = countWords(inputFilename);
            saveResultsToFile(wordCount, outputFilename);
            System.out.println("Результат в файле: " + outputFilename);
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static Map<String, Integer> countWords(String filename) throws IOException {
        Map<String, Integer> wordCount = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        String line;
        Pattern pattern = Pattern.compile("[\\p{Punct}]");

        while ((line = reader.readLine()) != null) {
            String cleanLine = pattern.matcher(line).replaceAll(" ").toLowerCase();
            String[] words = cleanLine.split("\\s+");

            for (String word : words) {
                if (!word.isEmpty()) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        }

        reader.close();
        return wordCount;
    }

    public static void saveResultsToFile(Map<String, Integer> wordCount, String outputFilename) throws IOException {
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCount.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilename));

        for (Map.Entry<String, Integer> entry : sortedList) {
            writer.write(entry.getKey() + " - " + entry.getValue());
            writer.newLine();
        }
        writer.close();
    }
}