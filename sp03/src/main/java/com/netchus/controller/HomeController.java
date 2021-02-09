package com.netchus.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	@RequestMapping(value = "/link", method = RequestMethod.GET)
	public String link(Locale locale, Model model) {
		
		return "link";
	}
	
	@RequestMapping(value = "/table", method = RequestMethod.GET)
	public String table(Locale locale, Model model) {
		
		return "table";
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String form(Locale locale, Model model) {
		
		return "form";
	}
	
	
	
	@RequestMapping(value = "/js01", method = RequestMethod.GET)
	public String js01(Locale locale, Model model) {
		
		return "js01";
	}
	
	@RequestMapping(value = "/js02", method = RequestMethod.GET)
	public String js02(Locale locale, Model model) {
		
		return "js02";
	}
	
	@RequestMapping(value = "/js03", method = RequestMethod.GET)
	public String js03(Locale locale, Model model) {
		
		return "js03";
	}
	
	
	
	@RequestMapping(value ="/kakao", method = RequestMethod.GET)
	public void kakaoMap(Model model) {
		// void 라 기본 view 경로가 kakap.jsp로 간다.
	}
	
	
	
}
