package com.mnklabs.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.mnklabs.spring.interceptor.FirstInterceptor;


@Controller
public class SampleController {

	
	private Logger logger = LoggerFactory.getLogger(SampleController.class);

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public ModelAndView showHelloPage(){
		logger.debug(">> showHelloPage");
		return new ModelAndView("hello");
	}
	
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public ModelAndView showHomePage(){
		logger.debug(">> showHomePage");
		return new ModelAndView("home");
	}


}


