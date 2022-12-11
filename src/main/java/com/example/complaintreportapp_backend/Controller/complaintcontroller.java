package com.example.complaintreportapp_backend.Controller;

import com.example.complaintreportapp_backend.dao.complaintdao;
import com.example.complaintreportapp_backend.model.Complaints;
import com.example.complaintreportapp_backend.model.Userreg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class complaintcontroller {

    @Autowired
    complaintdao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addcomplaint", consumes = "application/json", produces = "application/json")
    public HashMap<String,String> addcomplaint(@RequestBody Complaints c) {
        HashMap<String,String> map = new HashMap<>();
        dao.save(c);
         map.put("status","success");
        return  map;
}}
