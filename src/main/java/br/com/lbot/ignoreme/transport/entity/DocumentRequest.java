package br.com.lbot.ignoreme.transport.entity;

public class DocumentRequest {
    private static final String DEFAULT_COMMENT = "# Created by IGNOREME";
    private String text;
    public DocumentRequest(String text) {
        this.text = text;
    }
    public String getText() {
        return DEFAULT_COMMENT + " " +text;
    }
    public void setText(String text) {
        this.text = text;
    }
    @Override
    public String toString() {
        return "Document{" +
                "text='" + text + '\'' +
                '}';
    }

}
