package com.CMS2.DAO;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CMS2.Model.AdminModel;

public interface AdminDAO extends JpaRepository<AdminModel,String>{



	Optional<AdminModel> findById(String email);

	AdminModel findByEmail(String email);

}
