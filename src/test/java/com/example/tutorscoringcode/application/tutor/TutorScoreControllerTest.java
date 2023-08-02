package com.example.tutorscoringcode.application.tutor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TutorScoreControllerTest {

	@InjectMocks
	private TutorScoreController tutorScoreController;

	@Test
	void given_whenComputeTutorScoreBasedOnQuestionnaire_thenReturnResponse() {
		// Given When
		var response = tutorScoreController.computeTutorScoreBasedOnQuestionnaire("tutorId", TutorScoreRequest.builder().build());

		// Then
		assertEquals(0, response.getScore());
	}
}