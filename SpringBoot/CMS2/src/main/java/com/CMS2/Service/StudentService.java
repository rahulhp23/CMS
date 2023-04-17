package com.CMS2.Service;

import java.util.List;
import java.util.Optional;
import java.lang.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CMS2.Model.StudentModel;
import com.CMS2.DAO.StudentDAO;

@Service
public class StudentService {


	@Autowired
	StudentDAO ld;
	public StudentService() {
		
	}
	
	public List<StudentModel> getAllLogin(){
		
		return ld.findAll();
	}
	
	public void saveStudent(StudentModel ll) {
		ld.save(ll);
	}

	public void updateStudent(StudentModel ll1) {
		ld.save(ll1);
		
	}
	
	public void deleteStudent(StudentModel id) {
		ld.delete(id);
		
	}
	
	public StudentModel getStudentById(String email) {
		Optional<StudentModel> pm=ld.findById(email);
		if(pm.isPresent()) {
		
			return pm.get();
		}
		else 
		return null;
		 
	}

	public void saveUser(StudentModel ll) {
	
		ld.save(ll);
		
	}



}
