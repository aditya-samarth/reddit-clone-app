package com.redditclone.redditcloneapp.repository;

import com.redditclone.redditcloneapp.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository  extends JpaRepository <Comment, Long>
{
}
