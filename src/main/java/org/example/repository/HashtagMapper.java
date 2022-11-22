package org.example.repository;

import org.example.domain.Hashtag;
import org.springframework.stereotype.Repository;

@Repository
public interface HashtagMapper {

    Hashtag selectHashtag(Long id);

    void createHashtag(Hashtag hashtag);

    void updateHashtag(Hashtag hashtag);

    void deleteHashtag(Long id);
}
