package com.arunabhdas.chipmunk;

public class Chweet {
    private final long id;
    private final String content;

    public Chweet(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
