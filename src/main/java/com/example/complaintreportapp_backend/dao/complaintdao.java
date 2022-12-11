package com.example.complaintreportapp_backend.dao;

import com.example.complaintreportapp_backend.model.Complaints;
import org.springframework.data.repository.CrudRepository;

public interface complaintdao extends CrudRepository<Complaints,Integer> {
}
