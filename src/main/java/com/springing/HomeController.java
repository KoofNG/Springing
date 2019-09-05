package com.springing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Declaration of a page Controller
@Controller
public class HomeController {

    //    Declaration of HTTP request method
    @GetMapping("/")
    public String home() {
        return "index";
    }
}
