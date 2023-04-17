
package com.CMS2.Service;

import java.util.List;
import java.util.Optional;
import java.lang.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CMS2.Model.MEFacultyModel;
import com.CMS2.DAO.MEFacultyDAO;

@Service
public class MEFacultyService {


	@Autowired
	MEFacultyDAO ld;
	public MEFacultyService() {
		
	}
	
	public List<MEFacultyModel> getAllLogin(){
		
		return ld.findAll();
	}
	
	public void saveStudent(MEFacultyModel ll) {
		ld.save(ll);
	}

	public void updateStudent(MEFacultyModel ll1) {
		ld.save(ll1);
		
	}

	
	public void deleteStudent(MEFacultyModel id) {
		ld.delete(id);
		
	}
	
	public MEFacultyModel getStudentById(String email) {
		Optional<MEFacultyModel> pm=ld.findById(email);
		if(pm.isPresent()) {
			
			return pm.get();
		}else 
		return null;
		 
	}

	public void saveUser(MEFacultyModel ll) {
		// TODO Auto-generated method stub
		ld.save(ll);
		
	}


}
