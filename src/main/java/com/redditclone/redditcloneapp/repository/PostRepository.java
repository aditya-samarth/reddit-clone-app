package com.redditclone.redditcloneapp.repository;

import com.redditclone.redditcloneapp.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository <Post,Long> {
}
