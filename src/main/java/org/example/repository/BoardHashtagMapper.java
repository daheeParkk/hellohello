package org.example.repository;

import org.example.domain.BoardHashtag;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardHashtagMapper {

    BoardHashtag selectBoardHashtag();

    void createBoardHashtag(BoardHashtag boardHashtag);

    void updateBoardHashtag(BoardHashtag boardHashtag);

    void deleteBoardHashtag(Long id);
}
