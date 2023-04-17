
package com.CMS2.Service;

import java.util.List;
import java.util.Optional;
import java.lang.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CMS2.Model.CEStudentModel;
import com.CMS2.DAO.CEStudentDAO;

@Service
public class CEStudentService {


	@Autowired
	CEStudentDAO ld;
	public CEStudentService() {
		
	}
	
	public List<CEStudentModel> getAllLogin(){
		
		return ld.findAll();
	}
	
	public void saveStudent(CEStudentModel ll) {
		ld.save(ll);
	}

	public void updateStudent(CEStudentModel ll1) {
		ld.save(ll1);
		
	}

	
	
	public void deleteStudent(CEStudentModel id) {
		ld.delete(id);
		
	}
	
	public CEStudentModel getStudentById(String email) {
		Optional<CEStudentModel> pm=ld.findById(email);
		if(pm.isPresent()) {
			
			return pm.get();
		}else 
		return null;
		 
	}

	public void saveUser(CEStudentModel ll) {
		// TODO Auto-generated method stub
		ld.save(ll);
		
	}



}
