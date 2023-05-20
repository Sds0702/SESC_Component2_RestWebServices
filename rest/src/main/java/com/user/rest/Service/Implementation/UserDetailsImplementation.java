/*package com.user.rest.Service.Implementation;

import com.user.rest.Service.UserDetailsService;
import com.user.rest.model.UserDetails;
import com.user.rest.repository.UserDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsImplementation implements UserDetailsService {

    UserDetailsRepository userDetailsRepository;
    public UserDetailsImplementation(UserDetailsRepository userDetailsRepository) {
        this.userDetailsRepository = userDetailsRepository;
    }

    @Override
    public String createUserDetails(UserDetails userDetails) {
        userDetailsRepository.save(userDetails);
        return "Success";
    }

    @Override
    public String updateUserDetails(UserDetails userDetails) {
        userDetailsRepository.save(userDetails);
        return "Success";
    }

    @Override
    public String deleteUserDetails(Long Id) {
        userDetailsRepository.deleteById(Id);
        return "Success";
    }

    @Override
    public UserDetails getUserDetails(Long Id) {
        return userDetailsRepository.findById(Id).get();
    }

    @Override
    public List<UserDetails> getAllUserDetails() {
        return userDetailsRepository.findAll();
    }
}*/
