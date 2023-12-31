package com.example.tutorscoringcode.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tutor")
@Entity
public class Tutor {

	@Id
	@Column(name = "id", unique = true, nullable = false, updatable = false)
	String id;

	@Column(name = "score")
	double score;
}
