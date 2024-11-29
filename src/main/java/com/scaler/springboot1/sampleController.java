package com.scaler.springboot1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class sampleController {
    @GetMapping("hello")
    public String sayHello() {
        return "Hello World";
    }
    @GetMapping("bye")
    public String sayBye(){
        return "Bye World";
    }
}
