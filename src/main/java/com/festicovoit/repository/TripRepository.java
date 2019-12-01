package com.festicovoit.repository;

import com.festicovoit.entity.dbo.TripDbo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripRepository extends JpaRepository<TripDbo, Long> {
}
