package org.example.service.inter;

import org.example.dto.board.GetBoardResponse;
import org.example.domain.Board;

import java.util.List;

public interface BoardService {
    List<GetBoardResponse> selectBoardList();
    Board selectBoard(Long id);
    void createBoard(Board board);
    void updateBoard(Board board);
    void deleteBoard(Long id);
}
