package com.personal.starter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.starter.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
