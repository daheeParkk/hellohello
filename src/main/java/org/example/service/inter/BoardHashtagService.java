package org.example.service.inter;


import org.example.domain.BoardHashtag;

public interface BoardHashtagService {

    BoardHashtag getBoardHashtag();
    void createBoardHashtag(BoardHashtag boardHashtag);
    void updateBoardHashtag(BoardHashtag boardHashtag);
    void deleteBoardHashtag(Long id);
}
