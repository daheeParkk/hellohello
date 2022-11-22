package org.example.service.impl;

import org.example.domain.Comment;
import org.example.repository.CommentMapper;
import org.example.service.inter.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentMapper commentMapper;

    @Autowired
    public CommentServiceImpl(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }

    public Comment getComment(Long id) {
        return commentMapper.selectComment(id);
    }

    public void createComment(Comment category) {
        commentMapper.createComment(category);
    }

    public void updateComment(Comment category) {
        commentMapper.updateComment(category);
    }

    public void deleteComment(Long id) {
        commentMapper.deleteComment(id);

    }
}
