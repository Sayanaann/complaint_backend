package com.example.complaintreportapp_backend.dao;

import com.example.complaintreportapp_backend.model.Userreg;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Userdao extends CrudRepository<Userreg,Integer> {
   @Query(value="SELECT `id`, `address`, `emailid`, `name`, `password`, `phoneno`, `username` FROM `userreg` WHERE `emailid` = :emailid AND `password` = :password",nativeQuery = true)
   List<Userreg> Userlogin(@Param("emailid") String emailid, @Param("password") String password);

   @Query(value="SELECT `id`, `address`, `emailid`, `name`, `password`, `phoneno`, `username` FROM `userreg` WHERE `username` = :username ",nativeQuery = true)
   List<Userreg> finduser(@Param("username") String username);
}
