package org.example.controller;

import org.example.dto.board.GetBoardResponse;
import org.example.domain.Board;
import org.example.domain.BoardHashtag;
import org.example.service.inter.BoardHashtagService;
import org.example.service.inter.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;
    private final BoardHashtagService boardHashtagService;

    @Autowired
    public BoardController(BoardService boardService, BoardHashtagService boardHashtagService) {
        this.boardService = boardService;
        this.boardHashtagService = boardHashtagService;
    }

    @GetMapping
    public List<GetBoardResponse> getBoardList() {
        return boardService.selectBoardList();
    }

    @GetMapping("/{id}")
    public Board getBoard(@PathVariable("id") Long id) {
        return boardService.selectBoard(id);
    }

    @PostMapping("/")
    public String createBoard(@RequestBody Board board) {
        boardService.createBoard(board);
        return "ok";
    }

    @PatchMapping("/")
    public String updateBoard(@RequestBody Board board) {
        boardService.updateBoard(board);
        return "ok";
    }

    @DeleteMapping("/{id}")
    public String deleteBoard(@PathVariable("id") Long id) {
        return "ok";
    }

    @PostMapping("/hashtag")
    public String createBoardHashtag(@RequestBody BoardHashtag boardHashtag) {
        boardHashtagService.createBoardHashtag(boardHashtag);
        return "ok";
    }

    @DeleteMapping("/hashtag")
    public String deleteBoardHashtag(@RequestBody BoardHashtag boardHashtag) {
        boardHashtagService.deleteBoardHashtag(boardHashtag);
        return "ok";
    }
}
