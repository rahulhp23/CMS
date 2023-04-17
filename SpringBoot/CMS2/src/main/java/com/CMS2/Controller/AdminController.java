package com.CMS2.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CMS2.Model.AdminModel;
import com.CMS2.Service.AdminService;
import com.CMS2.DAO.AdminDAO;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class AdminController {
@Autowired
AdminService l;

//@GetMapping("view")
public List<AdminModel> getLogin() {
	
	return l.getAllLogin();

}

@PostMapping("viewadmin")
public AdminModel getAdmin(@RequestBody AdminModel id) {
	String id1=id.getEmail();
	return l.getAdminById(id1);
}

@Autowired
private AdminDAO gDOA;
@PostMapping("loginadmin")
@CrossOrigin(origins="http://localhost:4200")
public ResponseEntity<?>loginAdmin(@RequestBody AdminModel adminData){
	AdminModel admin=gDOA.findByEmail(adminData.getEmail());
	System.out.println(admin);
	if(admin.getPassword().equals(adminData.getPassword()))
		return ResponseEntity.ok(admin);                                                                                      //ok->HTTP status code of 200 (OK)
		return (ResponseEntity<?>) ResponseEntity.internalServerError();                             //otherwise HTTP status code of 500 (Internal Server Error) 
	}
	

@PostMapping("insertadmin")
public void saveL(@RequestBody AdminModel ll) {
	
	l.saveAdmin(ll);

}




}
