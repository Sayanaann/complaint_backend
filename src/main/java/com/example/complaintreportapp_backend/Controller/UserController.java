package com.example.complaintreportapp_backend.Controller;

import com.example.complaintreportapp_backend.dao.Userdao;
import com.example.complaintreportapp_backend.model.Userreg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    public Userdao dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String Homepage() {

        return "welcome to complaintreportapp";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/adduser", consumes = "application/json", produces = "application/json")
    public Userreg Registration(@RequestBody Userreg u) {
        dao.save(u);
        return u;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewuser")
    public List<Userreg> viewu() {
        return (List<Userreg>) dao.findAll();
    }
   @CrossOrigin(origins = "*")
    @PostMapping(path = "/userlogin", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> Userlogin(@RequestBody Userreg u)
    {
        HashMap<String,String> st =new HashMap<>();
        List<Userreg> result =(List<Userreg>) dao.Userlogin(u.getEmailid(), u.getPassword());
        if (result.size()==0){
            st.put("message","user doesn't exist");
        }else {
            int id =result.get(0).getId();
            st.put("userid",String.valueOf(id));
            st.put("status","success");
        }
        return st;


    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/getuser", consumes = "application/json", produces = "application/json")
    public  List<Userreg> getuser(@RequestBody Userreg u) {
        return (List<Userreg>) dao.finduser(u.getId());
    }

}
