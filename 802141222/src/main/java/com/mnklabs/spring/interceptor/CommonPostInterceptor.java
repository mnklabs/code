package com.mnklabs.spring.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class CommonPostInterceptor implements HandlerInterceptor{

	private Logger logger = LoggerFactory.getLogger(CommonPostInterceptor.class);
	
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp,
			Object handler) throws Exception {

		logger.debug(">> preHandle [handler = {} ]", handler);
		
		/* if false is returned then the page is not displayed
		 * and next below mentioned methods are not called
		 * and other interceptors are also not called 
		 */
		//return false;
		
		return true;
	}

	public void postHandle(HttpServletRequest req, HttpServletResponse resp,
			Object handler, ModelAndView mv) throws Exception {
		
		logger.debug(">> postHandle [handler={}, mv={}]", handler, mv);

	}


	public void afterCompletion(HttpServletRequest req,
			HttpServletResponse resp, Object handler, Exception exp)
					throws Exception {
		
		logger.debug(">> afterCompletion [handler={}]", handler);

	}

}
