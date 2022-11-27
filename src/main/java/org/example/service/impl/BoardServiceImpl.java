package org.example.service.impl;

import org.example.controller.dto.GetBoardResponse;
import org.example.domain.Board;
import org.example.repository.BoardMapper;
import org.example.service.inter.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class BoardServiceImpl implements BoardService {

    private final BoardMapper boardMapper;

    @Autowired
    public BoardServiceImpl(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public List<GetBoardResponse> selectBoardList() {
        List<Board> boards = boardMapper.selectBoardList();
        List<GetBoardResponse> response = new ArrayList<GetBoardResponse>();

        for(Board board : boards) {
            response.add(new GetBoardResponse(board));
        }
        return response;
    }

    public Board selectBoard(Long id) {

        return boardMapper.selectBoard(id);
    }

    public void createBoard(Board board) {
        boardMapper.createBoard(board);
    }

    public void associateBoardHashTag(List<Long> hashTagIds) {

    }

    public void updateBoard(Board board) {
        boardMapper.updateBoard(board);
    }

    public void deleteBoard(Long id) {
        boardMapper.deleteBoard(id);
    }
}
