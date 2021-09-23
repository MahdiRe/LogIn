package com.ideamart.LogIn.controller;

import com.ideamart.LogIn.model.LoginAuth;
import com.ideamart.LogIn.model.LoginEntity;
import com.ideamart.LogIn.repository.LoginRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "https://localhost:4200")
@RestController
@RequestMapping(value = "/login")
public class LoginController {

    private LoginRepository loginRepository;
    static List<LoginEntity> listOfUsers;

    public LoginController(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @PostMapping(value = "/create")
    public String createLogin(@RequestBody LoginEntity person){
        loginRepository.save(person);
        return "ok";
    }

    @PostMapping(value = "/auth")
    public String loginAuth(@RequestBody LoginAuth loginAuth){
        System.out.println(loginAuth.getLogName());
        return "auth K";
    }

    @GetMapping(value = "/all")
    public List<LoginEntity> getAll(){
        List<LoginEntity> list = new ArrayList<>();
        loginRepository.findAll().forEach(list::add);

        listOfUsers = list;

        return list;
    }

    @DeleteMapping(value = "/delete/{name}")
    public ResponseEntity<String> deleteByLogName(@PathVariable String name){
        loginRepository.deleteById(name);

        return new ResponseEntity<>("Test deleted successfully", HttpStatus.OK);
    }

    @PutMapping(value = "update/{logName}")
    public ResponseEntity<LoginEntity> updateById(@PathVariable String logName, @RequestBody LoginEntity login){
        Optional<LoginEntity> loginData = loginRepository.findById(logName);

        if (loginData.isPresent()){
            LoginEntity _login = loginData.get();
            _login.setfName(login.getfName());
            _login.setlName(login.getlName());
            _login.setPassword(login.getPassword());

            return  new ResponseEntity<>(loginRepository.save(_login), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
