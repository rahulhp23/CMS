
package com.CMS2.Service;

import java.util.List;
import java.util.Optional;
import java.lang.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CMS2.Model.EEFacultyModel;
import com.CMS2.DAO.EEFacultyDAO;

@Service
public class EEFacultyService {


	@Autowired
	EEFacultyDAO ld;
	public EEFacultyService() {
		
	}
	
	public List<EEFacultyModel> getAllLogin(){
		
		return ld.findAll();
	}
	
	public void saveStudent(EEFacultyModel ll) {
		ld.save(ll);
	}

	public void updateStudent(EEFacultyModel ll1) {
		ld.save(ll1);
		
	}

	
	
	public void deleteStudent(EEFacultyModel id) {
		ld.delete(id);
		
	}
	
	public EEFacultyModel getStudentById(String email) {
		Optional<EEFacultyModel> pm=ld.findById(email);
		if(pm.isPresent()) {
			
			return pm.get();
		}else 
		return null;
		 
	}

	public void saveUser(EEFacultyModel ll) {
		// TODO Auto-generated method stub
		ld.save(ll);
		
	}



}
