package com.user.rest.controller;

//import com.user.rest.Service.UserDetailsService;
import com.user.rest.model.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userdetails")
public class UserDetailsContoller {

    UserDetails userDetails;

    //UserDetailsService userDetailsService;
    @GetMapping("{Id}")
    public UserDetails getUserDetails(Long Id){
        return userDetails;
        //new UserDetails(1,"James","Paul",30,"Software Engineer");
        /*public UserDetails getUserDetails(@PathVariable("Id") Long Id){
        return userDetailsService.getUserDetails(Id);}*/
    }
    /*public UserDetailsContoller(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }*/

    /*Read all user details from DB
    @GetMapping()
    public List<UserDetails> getAllUserDetails(){
        return userDetailsService.getAllUserDetails();
        // new UserDetails(1,"James","Paul",30,"Software Engineer");
    }*/
    @PostMapping
    public String createUserDetails(@RequestBody UserDetails userDetails){
        //userDetailsService.createUserDetails(userDetails);
        this.userDetails = userDetails;
        return " Successfully created the user details";
    }
    @PutMapping
    public String updateUserDetails(@RequestBody UserDetails userDetails){
        this.userDetails = userDetails;
        //userDetailsService.updateUserDetails(userDetails);
        return " Successfully updated the user details";
    }
    @DeleteMapping("{Id}")
    public String deleteUserDetails(/*@PathVariable("Id")*/ Long Id){
        this.userDetails = userDetails;
        //userDetailsService.deleteUserDetails(Id);
        return " Successfully deleted the user details";
    }
}
