package com.project.questapp.repos;

import com.project.questapp.entities.Like;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LikeRepository extends JpaRepository<Like,Long> {
    
    List<Like> findByUserIdAndPostId(Long userId,Long postId);
    List<Like> findByUserId(Long aLong);
    List<Like> findByPostId(Long aLong);

}
