package com.example.tutorscoringcode.application.tutor;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class TutorScoreResponse {

	TutorScoreRequest tutorScoreRequest;
	double score;
}
