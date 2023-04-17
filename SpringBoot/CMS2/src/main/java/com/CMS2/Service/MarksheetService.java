
package com.CMS2.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CMS2.Model.MarksheetModel;
import com.CMS2.DAO.MarksheetDAO;

@Service
public class MarksheetService {


	@Autowired
	MarksheetDAO ld;
	public MarksheetService() {
		
	}
	
	public List<MarksheetModel> getAllLogin(){
		
		return ld.findAll();
	}
	
	public void saveStudent(MarksheetModel ll) {
		ld.save(ll);
	}

	public void updateStudent(MarksheetModel ll1) {
		ld.save(ll1);
		
	}

	
	
	public void deleteStudent(MarksheetModel id) {
		ld.delete(id);
		
	}
	


}
