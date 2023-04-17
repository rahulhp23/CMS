
package com.CMS2.DAO;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CMS2.Model.CEFacultyModel;

public interface CEFacultyDAO extends JpaRepository<CEFacultyModel,Integer>{



	Optional<CEFacultyModel> findById(String email);

	CEFacultyModel findByEmail(String email);

	
}
