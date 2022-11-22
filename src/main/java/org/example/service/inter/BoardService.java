package org.example.service.inter;

import org.example.domain.Board;

public interface BoardService {
    Board getBoardList();
    Board getBoard(Long id);
    void createBoard(Board board);
    void updateBoard(Board board);
    void deleteBoard(Long id);
}
