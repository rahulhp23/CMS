package com.CMS2.Service;

import java.util.List;
import java.util.Optional;
import java.lang.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CMS2.Model.EEStudentModel;
import com.CMS2.DAO.EEStudentDAO;

@Service
public class EEStudentService {


	@Autowired
	EEStudentDAO ld;
	public EEStudentService() {
		
	}
	
	public List<EEStudentModel> getAllLogin(){
		
		return ld.findAll();
	}
	
	public void saveStudent(EEStudentModel ll) {
		ld.save(ll);
	}

	public void updateStudent(EEStudentModel ll1) {
		ld.save(ll1);
		
	}

	
	
	public void deleteStudent(EEStudentModel id) {
		ld.delete(id);
		
	}
	
	public EEStudentModel getStudentById(String email) {
		Optional<EEStudentModel> pm=ld.findById(email);
		if(pm.isPresent()) {
			
			return pm.get();
		}else 
		return null;
		 
	}

	public void saveUser(EEStudentModel ll) {
		// TODO Auto-generated method stub
		ld.save(ll);
		
	}


}
