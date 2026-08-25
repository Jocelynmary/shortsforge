package com.shortsforge.services;

import com.shortsforge.core.Scene;
import com.shortsforge.core.Script;

import java.util.ArrayList;
import java.util.List;

public class ScriptParser {

    private final KeywordExtractor keywordExtractor;

    public ScriptParser(KeywordExtractor keywordExtractor) {
        this.keywordExtractor = keywordExtractor;
    }

    public Script parse(String rawScript) {
        if (rawScript == null || rawScript.isBlank()) {
            throw new IllegalArgumentException("Script text cannot be empty");
        }

        String[] sentences = rawScript.trim().split("(?<=[.!?])\\s+");
        List<Scene> scenes = new ArrayList<>();

        for (String sentence : sentences) {
            String trimmed = sentence.trim();
            if (trimmed.isEmpty()) {
                continue;
            }
            String keyword = keywordExtractor.extractKeyword(trimmed);
            scenes.add(new Scene(trimmed, keyword));
        }

        return new Script(scenes);
    }
}