package org.example.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
    @RequestMapping(value = "helloBody", method = RequestMethod.GET)
    @ResponseBody
    public String hello() {
        return "Hello Spring (text)";
    }

    @RequestMapping(value ="hello", method = RequestMethod.GET)
    public String helloBody() {
        return "hello";
    }
}