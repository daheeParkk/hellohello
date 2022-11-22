package org.example.service.impl;

import org.example.domain.Board;
import org.example.repository.BoardMapper;
import org.example.service.inter.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    private final BoardMapper boardMapper;

    @Autowired
    public BoardServiceImpl(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public Board getBoardList() {
        return boardMapper.selectBoardList();
    }

    public Board getBoard(Long id) {

        return boardMapper.selectBoard(id);
    }

    public void createBoard(Board board) {
        boardMapper.createBoard(board);
    }

    public void updateBoard(Board board) {
        boardMapper.updateBoard(board);
    }

    public void deleteBoard(Long id) {
        boardMapper.deleteBoard(id);
    }
}
