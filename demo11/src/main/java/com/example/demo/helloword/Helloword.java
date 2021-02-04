package com.example.demo.helloword;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWord {
    @GetMapping("/get")
     public String helloWord(){
        return "Hello word";
    }

}
