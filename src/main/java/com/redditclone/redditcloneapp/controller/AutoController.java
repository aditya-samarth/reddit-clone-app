package com.redditclone.redditcloneapp.controller;


import com.redditclone.redditcloneapp.dto.RegisterRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")

public class AutoController {
    @PostMapping("/signup")
    public void signup (@RequestBody RegisterRequest registerRequest){

    }
}
