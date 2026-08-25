package com.shortsforge.services;

public class KeywordExtractor {

    public String extractKeyword(String narrationText) {
        if (narrationText == null || narrationText.isBlank()) {
            throw new IllegalArgumentException("Narration text cannot be empty");
        }

        String[] words = narrationText.trim().split("\\s+");

        int wordCount = Math.min(3, words.length);
        StringBuilder keyword = new StringBuilder();

        for (int i = 0; i < wordCount; i++) {
            keyword.append(words[i].toLowerCase());
            if (i < wordCount - 1) {
                keyword.append(" ");
            }
        }

        return keyword.toString();
    }
}