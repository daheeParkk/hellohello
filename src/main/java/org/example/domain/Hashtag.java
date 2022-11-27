package org.example.domain;

public class Hashtag {

    private Long id;
    private String content;

    public Hashtag(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Hashtag() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
