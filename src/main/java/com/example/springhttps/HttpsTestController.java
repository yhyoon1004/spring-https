package com.example.springhttps;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/**")
public class HttpsTestController {
    @GetMapping("test")
    @ResponseBody
    public String testMethod() {
        return "test success!!";
    }
}
