package org.example.dto.board;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.example.domain.Board;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetBoardResponse {
    private Long id;
    private String title;
    private String content;
    private String nickname;
    private String category;

    public GetBoardResponse(Board board) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.content = board.getContent();
        this.nickname = board.getUser().getNickname();
        this.category = board.getCategory().getContent();
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
