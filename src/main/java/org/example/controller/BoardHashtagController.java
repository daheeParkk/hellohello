package org.example.controller;

import org.example.domain.BoardHashtag;
import org.example.service.inter.BoardHashtagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/boardHashtag")
public class BoardHashtagController {

    private final BoardHashtagService boardHashtagService;

    @Autowired
    public BoardHashtagController(BoardHashtagService boardHashtagService) {
        this.boardHashtagService = boardHashtagService;
    }
}
