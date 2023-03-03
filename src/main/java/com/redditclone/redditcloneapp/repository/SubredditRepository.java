package com.redditclone.redditcloneapp.repository;

import com.redditclone.redditcloneapp.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubredditRepository extends JpaRepository <Subreddit, Long> {

}
