package com.ideamart.LogIn.repository;

import com.ideamart.LogIn.model.LoginEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "https://localhost:4200")
public interface LoginRepository extends CrudRepository<LoginEntity, String> {
}
