
package com.CMS2.DAO;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CMS2.Model.EEFacultyModel;

public interface EEFacultyDAO extends JpaRepository<EEFacultyModel,Integer>{



	Optional<EEFacultyModel> findById(String email);

	EEFacultyModel findByEmail(String email);

	
}
