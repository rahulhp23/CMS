
package com.CMS2.DAO;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CMS2.Model.EEStudentModel;

public interface EEStudentDAO extends JpaRepository<EEStudentModel,Integer>{



	Optional<EEStudentModel> findById(String email);

	EEStudentModel findByEmail(String email);

	
}
