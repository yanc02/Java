package com.yan.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/home").setViewName("home");
//        registry.addViewController("/").setViewName("home/index");
//        registry.addViewController("/about").setViewName("home/about");
//        registry.addViewController("/Users/index").setViewName("users/index");

        //registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("account/login");
    }

}
