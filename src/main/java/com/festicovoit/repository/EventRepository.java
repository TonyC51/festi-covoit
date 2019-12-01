package com.festicovoit.repository;

import com.festicovoit.entity.dbo.EventDbo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<EventDbo, Long> {
}
