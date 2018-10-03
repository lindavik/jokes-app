package com.lv.jokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JokesController {

    @RequestMapping("/")
    public ModelAndView getJoke(){
        ModelAndView mav = new ModelAndView();
//        mav.
        mav.setViewName("chucknorris");
        return mav;
    }
}
