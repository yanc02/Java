package com.yan.controllers;
/*Created by IntelliJ IDEA.
        User: yan
        Date: 13/1/2018
        Time: 9:53 PM
*/
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class homeController {
    @RequestMapping("/")
    public String Index(){
        return "home/index";
    }


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
