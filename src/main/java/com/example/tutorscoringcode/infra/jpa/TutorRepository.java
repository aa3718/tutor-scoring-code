package com.example.tutorscoringcode.infra.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tutorscoringcode.domain.model.Tutor;

public interface TutorRepository extends JpaRepository<Tutor, String> {
}
