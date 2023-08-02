package com.example.tutorscoringcode.application.tutor;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TutorScoreController {

	@RequestMapping(
        method = RequestMethod.POST,
        value = "/tutor/{tutorId}/score",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
	public TutorScoreResponse computeTutorScoreBasedOnQuestionnaire(@PathVariable("tutorId") String tutorId,
	                                                                @RequestBody TutorScoreRequest tutorScoreRequest) {
		return TutorScoreResponse.builder()
				.score(0)
				.tutorScoreRequest(tutorScoreRequest)
				.build();
	}
}
