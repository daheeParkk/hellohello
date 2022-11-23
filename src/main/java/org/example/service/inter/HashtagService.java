package org.example.service.inter;


import org.example.domain.Hashtag;

public interface HashtagService {

    Hashtag selectHashtag(Long id);
    void createHashtag(Hashtag hashtag);
    void updateHashtag(Hashtag hashtag);
    void deleteHashtag(Long id);
}
