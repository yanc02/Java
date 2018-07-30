package com.yan.Controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

//@RestController
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "home/index";
    }

//    @PreAuthorize("hasAnyRole('ADMIN')")
//    @GetMapping("/secured/all")
//    public String securedHello() {
//        return "Secured Hello";
//    }
//
//    @GetMapping("/secured/alternate")
//    public String alternate() {
//        return "alternate";
//    }
    @PreAuthorize("hasAnyRole('ADMIN')")
    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public ModelAndView About() {

        List<String> messages = new ArrayList<String>();
        messages.add("About");
        messages.add("Your application description page.");

        ModelAndView model = new ModelAndView("home/about");
        model.addObject("messages", messages);

        return model;
    }
    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public ModelAndView Contact() {

        List<String> messages = new ArrayList<String>();
        messages.add("Contact");
        messages.add("Your contact page.");

        ModelAndView model = new ModelAndView("home/contact");
        model.addObject("messages", messages);

        return model;

    }




}



