package com.mnklabs.spring;

import org.springframework.web.multipart.MultipartFile;

public class UploadForm {

	private String otherParam;
	private MultipartFile myFile;

	
	

	public MultipartFile getMyFile() {
		return myFile;
	}

	public void setMyFile(MultipartFile myFile) {
		this.myFile = myFile;
	}

	public String getOtherParam() {
		return otherParam;
	}

	public void setOtherParam(String otherParam) {
		this.otherParam = otherParam;
	}
		
}
