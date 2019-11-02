package com.fsociety.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FsocietyController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloForm() {
        return "form";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String index(HttpServletRequest request, Model model) {

        //get from the ? part of the url
        String name = request.getParameter("name");

        if (name == null || name == "") {
            name = "blank";
        }

        model.addAttribute("name", name);
        return "welcome";
    }
}
