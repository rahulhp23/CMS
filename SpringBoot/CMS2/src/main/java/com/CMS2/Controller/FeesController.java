
package com.CMS2.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CMS2.Model.FeesModel;
import com.CMS2.Service.FeesService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class FeesController {
@Autowired
FeesService l;


@GetMapping("viewfees")
public List<FeesModel> getLogin() {
	
	return l.getAllLogin();

}

@PostMapping("addfees")
public void saveL(@RequestBody FeesModel ll) {
	
	l.saveStudent(ll);

}


}
