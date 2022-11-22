package org.example.service.inter;

import org.example.domain.Board;

import java.util.List;

public interface BoardService {
    List<Board> getBoardList();
    Board getBoard(Long id);
    void createBoard(Board board);
    void updateBoard(Board board);
    void deleteBoard(Long id);
}
