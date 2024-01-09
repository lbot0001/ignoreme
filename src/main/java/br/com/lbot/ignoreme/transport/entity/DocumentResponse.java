package br.com.lbot.ignoreme.transport.entity;

public class DocumentResponse {
    private String text;
    private String technology;
    private HeaderResponse header;
    private FooterResponse footer;

    public DocumentResponse() {
    }

    public DocumentResponse(String text) {
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

    public HeaderResponse getHeader() {
        return header;
    }

    public void setHeader(HeaderResponse headerResponse) {
        this.header = headerResponse;
    }

    public FooterResponse getFooter() {
        return footer;
    }

    public void setFooter(FooterResponse footer) {
        this.footer = footer;
    }

    @Override
    public String toString() {
        return header.getText() + "\n"
                + this.text + "\n"
                + footer.getText();
    }
}
