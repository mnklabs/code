package com.mnklabs.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WebController {

	@RequestMapping(value="/multiChkForm")
	public String showFormPage(ModelMap model){
		String[] names = new String[] {
			"kartik" , "srikanth", "pradeep" , "mahesh" , "anil"	
		};
		
		model.put("formcommand", new Form());
		model.put("names", names);
		
		return "multiChkForm";
	}
	
	
	@RequestMapping(value="/submitMultiChkForm")	
	public String showSample(@ModelAttribute Form form, ModelMap model){
		model.put("selectedNames", form.getNames());
		return "result";
	}
}
