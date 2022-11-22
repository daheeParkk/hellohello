package org.example.repository;

import org.example.domain.Comment;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentMapper {

    Comment selectComment(Long id);

    void createComment(Comment comment);

    void updateComment(Comment comment);

    void deleteComment(Long id);
}
