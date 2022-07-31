package com.fbc.Checklist;

import java.util.List;
import java.util.Optional;

public class UserService {

    //creating a new user
    public String add(Users user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "User has been created";
    }

    //getting a list of all users
    public List<User> getAll() {
        List<Users> users = userRepository.findAll();
        if (users.isEmpty()){
            throw new UserNotFoundException("Users not found");
        }
        return users;
    }

    //get one user by id
    public User getOne(Integer id) {
        Optional<Users> user = UserRepository.findById(id);
        if (!user.isPresent()){
            throw new UserNotFoundException("User with the ID " + id + " does not exist");
        }
        return user.get();
    }

    //to update a user record
    public String update(Users user) {
        Optional<Users> userFromDatabase = userRepository.findById(user.getId());
        if (!userFromDatabase.isPresent()) throw new UserNotFoundException("User does not exist");
        // Carry date created timestamp
        user.setDateCreated(userFromDatabase.get().getDateCreated());
        userRepository.save(user);
        return "User with ID " + user.getId() + " has been successfully updated";
    }
}
