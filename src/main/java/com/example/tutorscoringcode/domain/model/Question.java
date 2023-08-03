package com.example.tutorscoringcode.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "question")
@Entity
public class Question {

	@Id
	@Column(name = "id", unique = true, nullable = false, updatable = false)
	String questionId;
	@Column(name = "question_value")
	String questionValue;
	@Column(name = "question_type")
	QuestionType questionType;

	enum QuestionType {
		SINGLE_CHOICE,
		MULTIPLE_CHOICE
	}
}
