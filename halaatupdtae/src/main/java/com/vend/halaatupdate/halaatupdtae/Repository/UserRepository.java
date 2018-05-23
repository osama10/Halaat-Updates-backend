package com.vend.halaatupdate.halaatupdtae.Repository;

import com.vend.halaatupdate.halaatupdtae.Entity.UserModel;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends  CrudRepository <UserModel ,  Integer> {
    UserModel findByEmailAndPassword(String Email , String Password);
    UserModel findByEmail(String email);
}
