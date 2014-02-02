package com.mnklabs.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WebController {

	@RequestMapping(value="/employee")
	@ResponseBody
	public Employee showEmplopyeeAsJSON(ModelMap model){
		Employee emp = new Employee();
		emp.setName("kartik");
		emp.setAge(28);
		emp.setDob("13/11/1985");
		return emp;
	}
}
