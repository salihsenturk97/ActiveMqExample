package com.example.application1.Controller;

import com.example.application1.Service.ISendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendController {
@Autowired
    private ISendService sendService;

    @GetMapping("/send/{name}")
    public String sendName(@PathVariable("name") String name){
        this.sendService.sendName(name);
        return name ;
    }
}
