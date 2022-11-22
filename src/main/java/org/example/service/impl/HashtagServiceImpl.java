package org.example.service.impl;

import org.example.domain.Hashtag;
import org.example.repository.HashtagMapper;
import org.example.service.inter.HashtagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HashtagServiceImpl implements HashtagService {

    private final HashtagMapper hashtagMapper;

    @Autowired
    public HashtagServiceImpl(HashtagMapper hashtagMapper) {
        this.hashtagMapper = hashtagMapper;
    }

    public Hashtag getHashtag(Long id) {
        return hashtagMapper.selectHashtag(id);
    }

    public void createHashtag(Hashtag hashtag) {
        hashtagMapper.createHashtag(hashtag);

    }

    public void updateHashtag(Hashtag hashtag) {
        hashtagMapper.updateHashtag(hashtag);

    }

    public void deleteHashtag(Long id) {
        hashtagMapper.deleteHashtag(id);

    }
}
