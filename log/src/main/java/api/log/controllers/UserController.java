package api.log.controllers;
import api.log.services.UserService;
import api.log.models.UserModel;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<UserModel> getAllUsers() {
        return userService.getAllUsers();
    }


    @CrossOrigin(origins = "http://127.0.0.1:5173")
    @PostMapping("/register")
    public UserModel saveUser(@RequestBody UserModel user) {
        return this.userService.saveUser(user);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5173")
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserModel user) {
        UserModel userLogged = this.userService.loginUser(user);
        if (userLogged != null) {
            return ResponseEntity.ok(userLogged);
        } else {
            return ResponseEntity.status(401).build();
        }
    }
}
