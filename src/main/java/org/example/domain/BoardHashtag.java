package org.example.domain;

public class BoardHashtag {

    private Long id;
    private Long boardId;
    private Long hashtagId;

    public BoardHashtag(Long id, Long boardId, Long hashtagId) {
        this.id = id;
        this.boardId = boardId;
        this.hashtagId = hashtagId;
    }

    public BoardHashtag() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBoardId() {
        return boardId;
    }

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }

    public Long getHashtagId() {
        return hashtagId;
    }

    public void setHashtagId(Long hashtagId) {
        this.hashtagId = hashtagId;
    }
}
