
package com.CMS2.DAO;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CMS2.Model.MEFacultyModel;

public interface MEFacultyDAO extends JpaRepository<MEFacultyModel,Integer>{



	Optional<MEFacultyModel> findById(String email);

	MEFacultyModel findByEmail(String email);

	
}
