
package com.CMS2.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CMS2.Model.StaffModel;
import com.CMS2.Service.StaffService;
import com.CMS2.DAO.StaffDAO;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class StaffController {
@Autowired
StaffService l;


@GetMapping("viewstaff")
public List<StaffModel> getLogin() {
	
	return l.getAllLogin();

}

@PostMapping("viewstaffI")
public StaffModel getStudent(@RequestBody StaffModel id) {
	String id1=id.getEmail();
	return l.getStudentById(id1);
}


@PostMapping("addstaff")
public void saveL(@RequestBody StaffModel ll) {
	
	l.saveStudent(ll);

}


@PostMapping("updatestaff")
public void updateL(@RequestBody StaffModel ll) {
	
	l.updateStudent(ll);

}

@PostMapping("deletestaff")
public void deleteL(@RequestBody StaffModel id) {
	
	l.deleteStudent(id);

}

@Autowired
private StaffDAO gDOA;
@PostMapping("loginstaff")
@CrossOrigin(origins="http://localhost:4200")
public ResponseEntity<?>loginUser(@RequestBody StaffModel userData){
	StaffModel user=gDOA.findByEmail(userData.getEmail());
	System.out.println(user);
	if(user.getPassword().equals(userData.getPassword()))
		return ResponseEntity.ok(user);
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	}
	


}
