package com.CMS2.Service;

import java.util.List;
import java.util.Optional;
import java.lang.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CMS2.Model.AdminModel;
import com.CMS2.DAO.AdminDAO;

@Service
public class AdminService {


	@Autowired
	AdminDAO ld;
	public AdminService() {
		
	}
	
	public List<AdminModel> getAllLogin(){
		
		return ld.findAll();
	}
	
	public void saveAdmin(AdminModel ll) {
		ld.save(ll);
	}

	public AdminModel getAdminById(String email) {
		Optional<AdminModel> pm=ld.findById(email);
		if(pm.isPresent()) {
			return pm.get();
		}else 
		return null;
		 
	}

	public void saveAdmin1(AdminModel ll) {
		// TODO Auto-generated method stub
		ld.save(ll);
		
	}



}
