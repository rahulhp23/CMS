
package com.CMS2.DAO;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CMS2.Model.StaffModel;

public interface StaffDAO extends JpaRepository<StaffModel,Integer>{


	Optional<StaffModel> findById(String email);

	StaffModel findByEmail(String email);

	
}
