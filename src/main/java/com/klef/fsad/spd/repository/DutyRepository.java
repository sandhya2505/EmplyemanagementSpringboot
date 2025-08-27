package com.klef.fsad.spd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.fsad.spd.model.Duty;

@Repository
public interface DutyRepository extends JpaRepository<Duty, Integer>{

}
