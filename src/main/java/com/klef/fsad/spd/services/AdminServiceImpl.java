package com.klef.fsad.spd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.spd.model.Admin;
import com.klef.fsad.spd.model.Leave;
import com.klef.fsad.spd.model.Manager;
import com.klef.fsad.spd.repository.AdminRepository;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
     
	
	@Autowired
	private AdminRepository adminRepository;
	
	
	@Override
	public Admin checkadminlogin(String username, String password) {
		
		return adminRepository.findByUserNameAndPassword(username, password);
		
	}
	
	@Override
	public Manager addManager(Manager manager) {
		int  manager_id = generateRandomManagerId();
		return null;
		
		
	}
	
	
	@Override
	public List<Manager>viewAllManagers(){
		return null;
	}
	
	
	
	@Override
	public List<Leave>viewAllLeaveApplications(){
		return null;
		
	}
	

	
	
	
	
	private int generateRandomManagerId() {
		Random random = new Random();
		return 1000 + random.nextInt(9000);
		
	}
	
	
}
