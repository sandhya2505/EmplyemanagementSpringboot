 package com.klef.fsad.spd.services;

import com.klef.fsad.spd.model.Admin;
import com.klef.fsad.spd.model.Duty;
import com.klef.fsad.spd.model.Employee;
import com.klef.fsad.spd.model.Leave;
import com.klef.fsad.spd.model.Manager;
import java.util.List;




public interface AdminSevice {
	public Admin checkadminlogin(String username,String password);
	public Manager addManager(Manager manager);
	public List<Manager> viewAllManager();
	public String deleteManager();
	public List<Employee>viewAllEmployees();
	public String deleteEmployee();
	public long manageracount();
	public long employeecount();
	
	public String assigndutyToManager(Duty duty,int managerid);
	public String assigndutyToEmployee(Duty duty,int employeeid);
	public List<Leave>viewAllLeaveApplications();
}
