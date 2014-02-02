package com.mnklabs.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class WebController {

	private Logger logger = LoggerFactory.getLogger(WebController.class);

	@RequestMapping(value="/uploadForm", method=RequestMethod.GET)
	public String showFormPage(ModelMap model){
		UploadForm form = new UploadForm();
		form.setOtherParam("somevalue");
		model.put("uploadForm", form);
		return "uploadForm";
	}


	@RequestMapping(value="/uploadForm", method=RequestMethod.POST)	
	public String submitFormPage(@ModelAttribute("uploadForm") UploadForm form){
		logger.debug("Other param : {}", form.getOtherParam());
		logger.debug("file name : {} ", form.getMyFile().getOriginalFilename());
		return "result";
	}
}
