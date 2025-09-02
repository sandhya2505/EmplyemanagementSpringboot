package com.klef.fsad.spd.services;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.spd.model.Admin;
import com.klef.fsad.spd.model.Duty;
import com.klef.fsad.spd.model.Employee;
import com.klef.fsad.spd.model.Leave;
import com.klef.fsad.spd.model.Manager;
import com.klef.fsad.spd.repository.AdminRepository;

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
		String randomPassword = generateRandomPassword(8);
		return null;
		
		
	}
	
	
	@Override
	public List<Manager>viewAllManagers(){
		return null;
	}
	
	@Override
	public String deleteManager() {
		return null;
	}
	
	@Override
	public List<Employee>viewAllEmployees(){
		return null;
	}
	
	@Override
	public String deleteEmployee() {
		return null;
	}
	
	@Override
	public String assigndutyToManager(Duty duty, int managerid) {
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
	private String generateRandomPassword(int length) {
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String digits = "0123456789";
		String special = "~!@#$%^&*";
		String combined = upper + lower + digits + special;
		
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		sb.append(upper.charAt(random.nextInt(upper.length())));

		
		//upper.length() is 26;
		//suppose random.nextInt(26) gives 7;
		// so  upper.charAt(7) is H
		//Then sb.append('H') will add this into string builder.
        sb.append(lower.charAt(random.nextInt(lower.length())));
		sb.append(digits.charAt(random.nextInt(digits.length())));
		sb.append(special.charAt(random.nextInt(special.length())));
		
		for(int i=4; i<length;i++) {
			sb.append(combined.charAt(random.nextInt(combined.length())));
		}
		return sb.toString();
		)
		
		
		
	}
	
	
}
