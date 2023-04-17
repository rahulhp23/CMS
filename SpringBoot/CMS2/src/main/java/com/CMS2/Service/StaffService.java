
package com.CMS2.Service;

import java.util.List;
import java.util.Optional;
import java.lang.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CMS2.Model.StaffModel;
import com.CMS2.DAO.StaffDAO;

@Service
public class StaffService {


	@Autowired
	StaffDAO ld;
	public StaffService() {
		
	}
	
	public List<StaffModel> getAllLogin(){
		
		return ld.findAll();
	}
	
	public void saveStudent(StaffModel ll) {
		ld.save(ll);
	}

	public void updateStudent(StaffModel ll1) {
		ld.save(ll1);
		
	}

	
	
	public void deleteStudent(StaffModel id) {
		ld.delete(id);
		
	}
	
	public StaffModel getStudentById(String email) {
		Optional<StaffModel> pm=ld.findById(email);
		if(pm.isPresent()) {
			return pm.get();
		}else 
		return null;
		 
	}

	public void saveUser(StaffModel ll) {
		
		ld.save(ll);
		
	}



}
