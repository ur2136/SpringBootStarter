package com.personal.starter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.starter.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
