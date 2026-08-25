package com.shortsforge.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KeywordExtractorTest {

    @Test
    public void testExtractKeywordReturnsFirstThreeWords() {
        KeywordExtractor extractor = new KeywordExtractor();
        String result = extractor.extractKeyword("The sun rises slowly over the mountains");
        assertEquals("the sun rises", result);
    }

    @Test
    public void testExtractKeywordWithFewerThanThreeWords() {
        KeywordExtractor extractor = new KeywordExtractor();
        String result = extractor.extractKeyword("Hello world");
        assertEquals("hello world", result);
    }

    @Test
    public void testExtractKeywordThrowsOnNull() {
        KeywordExtractor extractor = new KeywordExtractor();
        assertThrows(IllegalArgumentException.class, () -> extractor.extractKeyword(null));
    }

    @Test
    public void testExtractKeywordThrowsOnBlank() {
        KeywordExtractor extractor = new KeywordExtractor();
        assertThrows(IllegalArgumentException.class, () -> extractor.extractKeyword("   "));
    }
}