package com.redditclone.redditcloneapp.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long postId;
    @Nullable
    private String postName;
    @Nullable
    private String url;
    @Nullable
    @Lob
    private String description;
    private Integer voteCount = 0;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", referencedColumnName ="userId")
    private User user;
   private Instant createddate;
   @Nullable
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "id", referencedColumnName = "id")
   private Subreddit subreddit;

}
