package org.ex5;

public class Document {
    private String type;
    private String content;

    public Document(String type, String content) {
        this.type = type;
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Tip: " + type + ", Continut: " + content;
    }
}
