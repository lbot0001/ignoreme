package br.com.lbot.ignoreme.transport.entity;

public class DocumentRequest {
    private String text;
    private String technology;
    public DocumentRequest() {
    }
    public DocumentRequest(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
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

    @Override
    public String toString() {
        return "Document{" +
                "text='" + text + '\'' +
                '}';
    }

}
