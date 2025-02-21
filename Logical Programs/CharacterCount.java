package com.studenttribe.tasks;
public class CharacterCount {

    public static void main(String[] args) {
        String sentence = "progra5mmer i2s g4ood abh1i 3a";
        int charCount = countCharacters(sentence);
        System.out.println("Total number of characters (excluding numbers): " + charCount);
    }

    public static int countCharacters(String sentence) {
        // Remove the numbers from the sentence
        String cleanedSentence = sentence.replaceAll("[0-9]", "");
        
        // Return the length of the cleaned sentence
        return cleanedSentence.length();
    }
}
