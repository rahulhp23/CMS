
package com.CMS2.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CMS2.Model.MarksheetModel;
import com.CMS2.Service.MarksheetService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class MarksheetController {
@Autowired
MarksheetService l;


@GetMapping("viewmemarksheet")
public List<MarksheetModel> getLogin() {
	
	return l.getAllLogin();

}

@PostMapping("addmemarksheet")
public void saveL(@RequestBody MarksheetModel ll) {
	
	l.saveStudent(ll);

}


@PostMapping("updatememarksheet")
public void updateL(@RequestBody MarksheetModel ll) {
	
	l.updateStudent(ll);

}

@PostMapping("deletememarksheet")
public void deleteL(@RequestBody MarksheetModel id) {
	
	l.deleteStudent(id);

}


}
