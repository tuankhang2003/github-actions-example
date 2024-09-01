package com.khang.springbootcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
    @GetMapping("/welcome")
    public String welcome(){
        return "Hello World";
    }
}
