package com.klef.fsad.spd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.fsad.spd.model.Admin;



@Repository
public interface AdminRepository extends JpaRepository <Admin, Integer>{

}
