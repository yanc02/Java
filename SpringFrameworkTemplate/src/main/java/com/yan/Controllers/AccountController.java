package com.yan.Controllers;

import com.yan.Model.Users;
import com.yan.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AccountController {

    @Autowired
    private UsersRepository userRepository;

    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login?logout";
    }

    @RequestMapping(value = "/Account/register", method = RequestMethod.GET)
    public ModelAndView Register() {

        Users user = new Users();
        System.out.println("register!!!!");
        ModelAndView model = new ModelAndView("account/register");
        model.addObject("user", user);


        return model;
    }

    @RequestMapping(value = "/Account/register", method = RequestMethod.POST)
    public RedirectView Register (@ModelAttribute("user")Users user, BindingResult result){

        System.out.println("entre al post");
        if (result.hasErrors()) {
            return new RedirectView("/Account/registerError");
        }
        userRepository.save(user);
        return new RedirectView("/Account/registerSuccess");

    }

    @RequestMapping(value = "/Account/registerError", method = RequestMethod.GET)
    public String RegisterError() {

        return "/account/registerError";
    }

    @RequestMapping(value = "/Account/registerSuccess", method = RequestMethod.GET)
    public String RegisterSuccess() {

        return "/account/registerSuccess";
    }





}
