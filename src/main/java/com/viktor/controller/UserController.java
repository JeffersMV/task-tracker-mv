package com.viktor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jeff on 20.04.15.
 */
@Controller
public class UserController {

    @RequestMapping(value = "/messagehome", method = RequestMethod.GET)
    public String user(ModelMap model) {
        model.addAttribute("message", " ecscdscsdcsdsc");
        return "messagehome";
    }
}
