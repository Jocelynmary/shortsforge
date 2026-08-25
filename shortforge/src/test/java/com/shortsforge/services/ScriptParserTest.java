package com.shortsforge.services;

import com.shortsforge.core.Script;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScriptParserTest {

    @Test
    public void testParseSplitsIntoCorrectNumberOfScenes() {
        ScriptParser parser = new ScriptParser(new KeywordExtractor());
        Script script = parser.parse("The sun rises. Birds start singing. The day begins.");
        assertEquals(3, script.getScenes().size());
    }

    @Test
    public void testParseAssignsCorrectNarrationAndKeyword() {
        ScriptParser parser = new ScriptParser(new KeywordExtractor());
        Script script = parser.parse("The sun rises slowly.");
        assertEquals("The sun rises slowly.", script.getScenes().get(0).getNarrationText());
        assertEquals("the sun rises", script.getScenes().get(0).getKeyword());
    }

    @Test
    public void testParseThrowsOnNull() {
        ScriptParser parser = new ScriptParser(new KeywordExtractor());
        assertThrows(IllegalArgumentException.class, () -> parser.parse(null));
    }

    @Test
    public void testParseThrowsOnBlank() {
        ScriptParser parser = new ScriptParser(new KeywordExtractor());
        assertThrows(IllegalArgumentException.class, () -> parser.parse("   "));
    }
}