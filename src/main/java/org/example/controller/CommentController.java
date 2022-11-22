package org.example.controller;

import org.example.domain.Category;
import org.example.domain.Comment;
import org.example.service.inter.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping("/post")
    public String createComment(@RequestBody Comment comment) {
        commentService.createComment(comment);
        return "ok";
    }

    @PatchMapping("/patch")
    public String updateComment(@RequestBody Comment comment) {
        commentService.updateComment(comment);
        return "ok";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteComment(@PathVariable("id") Long id) {
        return "ok";
    }
}
