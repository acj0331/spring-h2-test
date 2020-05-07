package com.score.oss.conversions.middleware.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.score.oss.conversions.middleware.model.User;
import com.score.oss.conversions.middleware.repository.UserRepository;

@RestController
@RequestMapping("/rest/*")
public class UserController {
    @Autowired
    UserRepository userRepo;
    
    @RequestMapping(value="/userList", method=RequestMethod.GET)
    public List<User> getUser() {
        return userRepo.findAll();
    }
    
    @RequestMapping(value="/admin", method=RequestMethod.GET)
    public User getAdmin() {
        return userRepo.findAdmin();
    }
}
