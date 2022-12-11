package com.example.complaintreportapp_backend.Controller;

import com.example.complaintreportapp_backend.dao.complaintdao;
import com.example.complaintreportapp_backend.model.Complaints;
import com.example.complaintreportapp_backend.model.Userreg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
}
    @CrossOrigin(origins = "*")
    @GetMapping (path = "/viewallcomplaints")
    public List<Map<String,String>> viewall() {
        return  (List<Map<String, String>>) dao.complaints();

}
    @CrossOrigin(origins = "*")
    @PostMapping (path = "/mycomplaints", consumes = "application/json", produces = "application/json")
    public List<Complaints> viewmycomplaints(@RequestBody Complaints c) {
        return  (List<Complaints>) dao.viewmycomplaints(c.getUserid());
}}
