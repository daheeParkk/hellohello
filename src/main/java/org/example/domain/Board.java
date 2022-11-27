package org.example.domain;

import java.util.List;

public class Board {

    private Long id;
    private String title;
    private String content;
    private User user;
    private List<Hashtag> hashtag;
    private Category category;

    private List<Comment> comments;

    public Board(Long id, String title, String content, User user, List<Hashtag> hashtag, Category category, List<Comment> comments) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.user = user;
        this.hashtag = hashtag;
        this.category = category;
        this.comments = comments;
    }

    public Board() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Hashtag> getHashtag() {
        return hashtag;
    }

    public void setHashtag(List<Hashtag> hashtag) {
        this.hashtag = hashtag;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Long getUserId() {
        return this.user.getId();
    }

    public void setUserId(Long userId) {
        this.user.setId(userId);
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
