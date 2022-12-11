package com.example.complaintreportapp_backend.dao;

import com.example.complaintreportapp_backend.model.Complaints;
import com.example.complaintreportapp_backend.model.Userreg;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface complaintdao extends CrudRepository<Complaints,Integer> {
    @Query(value="SELECT  u.`address`, u.`emailid`, u.`name`, u.`phoneno`, c.complaints FROM `userreg` u JOIN complaints c ON c.userid=u.id",nativeQuery = true)
    List <Map<String,String>> complaints();

    @Query(value="SELECT `id`, `complaints`, `userid` FROM `complaints` WHERE `userid` = :userid",nativeQuery = true)
    List <Complaints> viewmycomplaints(@Param("userid") Integer userid);

}
