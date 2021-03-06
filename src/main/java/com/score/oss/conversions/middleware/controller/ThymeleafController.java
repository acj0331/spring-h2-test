package com.score.oss.conversions.middleware.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.score.oss.conversions.middleware.repository.UserRepository;

@Controller
@RequestMapping("/thymeleaf/*")
public class ThymeleafController {
    @Autowired
    UserRepository userRepo;
    
    @RequestMapping(value="/",method=RequestMethod.GET)
    public String thymeleafSample(Model model) {
        model.addAttribute("key1","val1");
        List<String>strList = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            strList.add(String.format("%s-%d", "element",i+1));
        }
        model.addAttribute("strList",strList);
        
        Map<String,String> strMap = new HashMap<>();
        strMap.put("key1", "val1");
        strMap.put("key2", "val2");     
        strMap.put("key3", "val3");   
        model.addAttribute("strMap",strMap);
        
        //thymeleaf.html
        return "thymeleaf";
    }
    
    @RequestMapping(value="/userList",method=RequestMethod.GET)
    public String thymeleafUserList(Model model) {
        model.addAttribute("userList", userRepo.findAll());
        
        //userList.html
        return "userList";
    }
}
