package com.mywebapp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*import org.springframework.web.bind.annotation.ResponseBody;*/
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	/* @ResponseBody */
	public ModelAndView home(Alien alien) {
		/*
		 * HttpServletRequest req, HttpSession session
		 * @RequestParam("name") String Myname
		 * HttpSession session=req.getSession(); String name=req.getParameter("name");
		 * System.out.println("Hi "+Myname);
		 * session.setAttribute("name", Myname);
		 */
		System.out.println("Hi "+alien);
		ModelAndView mv=new ModelAndView();
		mv.addObject("alien", alien);
		mv.setViewName("home");
		return mv;
	}
}
