package com.redditclone.redditcloneapp.repository;

import com.redditclone.redditcloneapp.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository <Vote, Long> {
}
