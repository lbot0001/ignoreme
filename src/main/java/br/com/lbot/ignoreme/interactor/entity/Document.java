package br.com.lbot.ignoreme.interactor.entity;

public class Document {

    private static final String DEFAULT_COMMENT = "# Created by IGNOREME";
    private String text;
    private String technology;
    public Document(String text) {
        this.text = text;
    }
    public String getText() {
        return DEFAULT_COMMENT + " " +text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
}
