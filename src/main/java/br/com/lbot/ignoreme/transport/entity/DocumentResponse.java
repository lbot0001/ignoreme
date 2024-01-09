package br.com.lbot.ignoreme.transport.entity;

public class DocumentResponse {

    private static final String DEFAULT_COMMENT = "# Created by IGNOREME";
    private String text;

    public DocumentResponse(String text) {
        this.text = text;
    }

    public String getText() {
        return DEFAULT_COMMENT + " " +text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
