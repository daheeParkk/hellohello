package org.example.controller;

import org.example.domain.Category;
import org.example.domain.Comment;
import org.example.service.inter.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comment")
public class CommentController {

    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/{id}")
    public String getComment(@PathVariable("id") Long id) {
        return "ok";
    }

    @PostMapping("/")
    public ResponseEntity createComment(@RequestBody Comment comment) {
        commentService.createComment(comment);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PatchMapping("/")
    public String updateComment(@RequestBody Comment comment) {
        commentService.updateComment(comment);
        return "ok";
    }

    @DeleteMapping("/{id}")
    public String deleteComment(@PathVariable("id") Long id) {
        return "ok";
    }
}
