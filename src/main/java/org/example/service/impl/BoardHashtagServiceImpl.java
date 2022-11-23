package org.example.service.impl;

import org.example.domain.BoardHashtag;
import org.example.repository.BoardHashtagMapper;
import org.example.service.inter.BoardHashtagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardHashtagServiceImpl implements BoardHashtagService {

    private final BoardHashtagMapper boardHashtagMapper;

    @Autowired
    public BoardHashtagServiceImpl(BoardHashtagMapper boardHashtagMapper) {
        this.boardHashtagMapper = boardHashtagMapper;
    }

    public BoardHashtag selectBoardHashtag() {
        return boardHashtagMapper.selectBoardHashtag();
    }

    public void createBoardHashtag(BoardHashtag boardHashtag) {
        boardHashtagMapper.createBoardHashtag(boardHashtag);
    }

    public void updateBoardHashtag(BoardHashtag boardHashtag) {
        boardHashtagMapper.updateBoardHashtag(boardHashtag);
    }

    public void deleteBoardHashtag(Long id) {
        boardHashtagMapper.deleteBoardHashtag(id);
    }
}
