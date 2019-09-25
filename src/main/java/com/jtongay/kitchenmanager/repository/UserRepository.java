package com.jtongay.kitchenmanager.repository;

import com.jtongay.kitchenmanager.model.UserModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<UserModel, Long> {
    List<UserModel> findByUsername(String username);
}
