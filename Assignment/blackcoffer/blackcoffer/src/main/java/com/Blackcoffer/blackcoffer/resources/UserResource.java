package com.Blackcoffer.blackcoffer.resources;

import com.Blackcoffer.blackcoffer.entities.UserEntity;
import com.Blackcoffer.blackcoffer.models.UserModel;
import com.Blackcoffer.blackcoffer.repositories.UserRepository;
import com.Blackcoffer.blackcoffer.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserResource {
    @Autowired
    UserService userService;
    @Autowired
    UserRepository userRepository;
    @GetMapping("/")
    public String dashboard(){
        return "dashboard";
    }

    @GetMapping("/showDashboard")
    public String show(Model model){
        List<UserEntity>  list = userRepository.findAll();
        model.addAttribute("getDetails", list);
        return "showDetails";
    }

    // created By Pankaj Kumar Gupta
    @PostMapping("/save-User")
    public ResponseEntity saveUserDetail(@ModelAttribute UserModel userModel){
        return userService.saveUserDetail(userModel);
    }
   /* @GetMapping("/getAllUserDetails")
    public List<UserModel> getAllUserDetails(){
        return userService.getAllUserDetails();
    }*/

}
