package com.NITW_OLX.WebApp.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome";
    }

}
