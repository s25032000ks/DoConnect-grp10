package com.grp10.doconnect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grp10.doconnect.entity.Post;
import com.grp10.doconnect.entity.User;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

	List<Post> findByUser(User user);

}
