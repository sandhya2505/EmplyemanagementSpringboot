package com.klef.fsad.spd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.fsad.spd.model.Email;

@Repository
public interface EmailRepository  extends JpaRepository<Email, Integer>{

}
