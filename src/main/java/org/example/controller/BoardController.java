package org.example.controller;

import org.example.domain.Board;
import org.example.service.inter.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/")
    public String getBoardList() {
        return "ok";
    }

    @GetMapping("/{id}")
    public String getBoard(@PathVariable("id") Long id) {
        return "ok";
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
}
