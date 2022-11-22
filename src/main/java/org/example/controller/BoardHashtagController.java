package org.example.controller;

import org.example.domain.BoardHashtag;
import org.example.service.inter.BoardHashtagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/BoardHash")
public class BoardHashtagController {

    private final BoardHashtagService boardHashtagService;

    @Autowired
    public BoardHashtagController(BoardHashtagService boardHashtagService) {
        this.boardHashtagService = boardHashtagService;
    }

    @GetMapping()
    public String getBoardHashtag() {
        return "ok";
    }


    @PostMapping("/post")
    public String createBoardHashtag(@RequestBody BoardHashtag boardHashtag) {
        boardHashtagService.createBoardHashtag(boardHashtag);
        return "ok";
    }

    @PatchMapping("/patch")
    public String updateBoardHashtag(@RequestBody BoardHashtag boardHashtag) {
        boardHashtagService.updateBoardHashtag(boardHashtag);
        return "ok";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBoardHashtag(@PathVariable("id") Long id) {
        return "ok";
    }
}
