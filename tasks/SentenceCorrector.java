package com.studenttribe.tasks;
import java.util.Arrays;

public class SentenceCorrector {

    public static void main(String[] args) {
        String sentence = "progra5mmer i2s g4ood abh1i 3a";
        String correctedSentence = correctSentence(sentence);
        System.out.println("Corrected Sentence: " + correctedSentence);
    }

    public static String correctSentence(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Remove numbers and sort the words
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[0-9]", "");
        }
        Arrays.sort(words);
        
        // Join the words to form the corrected sentence
        String correctedSentence = String.join(" ", words);
        
        // Capitalize the first letter and add a period at the end
        correctedSentence = correctedSentence.substring(0, 1).toUpperCase() + correctedSentence.substring(1) + ".";
        
        return correctedSentence;
    }
}
