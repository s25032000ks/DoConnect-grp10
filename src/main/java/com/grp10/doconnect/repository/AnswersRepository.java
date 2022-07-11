package com.grp10.doconnect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grp10.doconnect.entity.Answers;
import com.grp10.doconnect.entity.Post;
import com.grp10.doconnect.entity.User;

@Repository
public interface AnswersRepository extends JpaRepository<Answers, Long> {
	List<Answers> findByPost(Post post);

	List<Answers> findAllByUser(User user);
}
