package com.example.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class mass {
@GetMapping("/home")

    public String hom(){
    return "hello";
}

}
