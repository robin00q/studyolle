package com.studyolle.zone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ZoneRepository extends JpaRepository {
}
