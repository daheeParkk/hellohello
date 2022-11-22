package org.example.repository;

import org.example.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {

    Board selectBoardList();

    Board selectBoard(Long id);

    void createBoard(Board board);

    void updateBoard(Board board);

    void deleteBoard(Long id);
}
