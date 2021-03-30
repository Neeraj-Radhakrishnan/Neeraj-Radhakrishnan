package com.neeraj.assignmentproject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neeraj.assignmentproject.service.SimpleInterestService;

@Controller
public class SimpleInterestController {
	
	@RequestMapping("/simpleInterest")
	public ModelAndView simpleInterestController(HttpServletRequest request , HttpServletResponse response) {
		
		double p = Double.parseDouble(request.getParameter("p"));
		double t = Double.parseDouble(request.getParameter("t"));
		double r = Double.parseDouble(request.getParameter("r"));
		
		SimpleInterestService ss = new SimpleInterestService();
		double interest = ss.simpleInterest(p, t, r);
		
		ModelAndView mv = new ModelAndView("simpleInterestView.jsp");
		//mv.setViewName("simpleInterestView.jsp");
		mv.addObject("result",interest);
		
		return mv;
		
	}

}
