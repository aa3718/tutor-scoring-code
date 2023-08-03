package com.example.tutorscoringcode.domain.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class TutorAnswer {

	@Id
	@Column(name = "id", unique = true, nullable = false, updatable = false)
	String tutorAnswerId;

	@Column(name = "tutor_id")
	String tutorId;

	@Column(name = "question_id")
	String questionId;

	@Column(name = "option_id")
	String optionId;
}
