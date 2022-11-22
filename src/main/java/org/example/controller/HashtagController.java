package org.example.controller;

import org.example.domain.Comment;
import org.example.domain.Hashtag;
import org.example.service.inter.HashtagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hashtag")
public class HashtagController {

    private final HashtagService hashtagService;

    @Autowired
    public HashtagController(HashtagService hashtagService) {
        this.hashtagService = hashtagService;
    }

    @GetMapping("/{id}")
    public String getHashtag(@PathVariable("id") Long id) {
        return "ok";
    }

    @PostMapping("/c")
    public String createHashtag(@RequestBody Hashtag hashtag) {
        hashtagService.createHashtag(hashtag);
        return "ok";
    }

    @PutMapping("/u")
    public String updateHashtag(@RequestBody Hashtag hashtag) {
        hashtagService.updateHashtag(hashtag);
        return "ok";
    }

    @DeleteMapping("/d/{id}")
    public String deleteHashtag(@PathVariable("id") Long id) {
        return "ok";
    }
}
