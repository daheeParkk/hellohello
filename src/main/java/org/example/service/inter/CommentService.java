package org.example.service.inter;


import org.example.domain.Comment;

public interface CommentService {

    Comment selectComment(Long id);
    void createComment(Comment category);
    void updateComment(Comment category);
    void deleteComment(Long id);
}
