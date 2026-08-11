package com.shortsforge.core;

public class Scene {
    private final String narrationText;  //field
    private final String keyword;

    public Scene(String narrationText, String keyword) {
        this.narrationText = narrationText;
        this.keyword = keyword;
    }

    public String getNarrationText() {
        return narrationText;          //getter
    }

    public String getKeyword() {
        return keyword;
    }
}