package com.festicovoit.repository;

import com.festicovoit.entity.dbo.UserParticipantDbo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserParticipantRepository extends JpaRepository<UserParticipantDbo, Long> {
}
