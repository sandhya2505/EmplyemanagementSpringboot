package com.klef.fsad.spd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.fsad.spd.model.Leave;

@Repository
public interface LeaveRepository extends JpaRepository<Leave, Integer>{

}
