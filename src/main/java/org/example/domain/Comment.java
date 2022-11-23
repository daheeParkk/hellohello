package org.example.domain;

public class Comment {

    private Long id;
    private String content;
    private Long userId;
    private Long boardId;

    public Comment(Long id, String content, Long userId, Long boardId) {
        this.id = id;
        this.content = content;
        this.userId = userId;
        this.boardId = boardId;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBoardId() {
        return boardId;
    }

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }
}
