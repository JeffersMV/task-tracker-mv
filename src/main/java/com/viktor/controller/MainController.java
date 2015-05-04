package com.viktor.controller;


import com.viktor.model.Project;
import com.viktor.service.ProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;


@Controller
public class MainController {
    public static final Logger log = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private ProjectService projectService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView allProjects() {
        ModelAndView modelAndView = new ModelAndView();
        List<Project> projectList = projectService.projectList();

        modelAndView.addObject("projectList", projectList);
        modelAndView.setViewName("home");
        return modelAndView;

    }

//    @RequestMapping(value = "/messagehome", method = RequestMethod.GET)
//    public String user(ModelMap model) {
//        log.error("Process " + model);
//        model.addAttribute("message", " ecscdscsdcsdsc");
//
//
//        return "messagehome2";
//}



}
