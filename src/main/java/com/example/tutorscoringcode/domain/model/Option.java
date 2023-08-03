package com.example.tutorscoringcode.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Primary;

@Table(name = "option")
@Entity
public class Option {

	@Id
	@Column(name = "id", unique = true, nullable = false, updatable = false)
	String optionId;

	@Column(name = "question_id")
	String questionId;

	@Column(name = "option_value")
	String optionValue;
}
