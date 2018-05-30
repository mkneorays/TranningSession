package com.neorays.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

   @RequestMapping("home.htm")
   public String index(Model model) {
 System.out.println("controller");
      model.addAttribute("message", "Hello Spring MVC 5!");
      return "welcome";
   }//method
}//class