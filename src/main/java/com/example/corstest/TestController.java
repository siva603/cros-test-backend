package com.example.corstest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")

public class TestController{

    @GetMapping
    public ResponseEntity<String> handleLogin(){

        System.out.println("Get mapping working correctly");
        return new ResponseEntity<>("Get mapping working correctly",HttpStatus.OK);
    }

    @PostMapping
    public  ResponseEntity<String> handlePost(){

        System.out.println("Post mapping working correctly");
        return new ResponseEntity<>("Post mapping working correctly",HttpStatus.OK);
    }

    @PutMapping
    public  ResponseEntity<String> handlePut(){

        System.out.println("Put mapping working correctly");
        return new ResponseEntity<>("Put mapping working correctly",HttpStatus.OK);
    }

    @DeleteMapping
    public  ResponseEntity<String> handleDelete(){

        System.out.println("Delete mapping working correctly");
        return new ResponseEntity<>("Delete mapping working correctly",HttpStatus.OK);
    }
}

