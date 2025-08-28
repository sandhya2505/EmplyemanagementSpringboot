package com.klef.fsad.spd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.fsad.spd.model.ResetToken;

@Repository
public interface ResetRepository extends JpaRepository<ResetToken,Long> {

	
	
}
