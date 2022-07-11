package com.grp10.doconnect.entity;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Answers {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;
	@NotEmpty
	private String text;
	@ManyToOne(fetch = LAZY)
	@JoinColumn(name = "postId", referencedColumnName = "postId")
	private Post post;
	@ManyToOne(fetch = LAZY)
	@JoinColumn(name = "userId", referencedColumnName = "userId")
	private User user;
}
