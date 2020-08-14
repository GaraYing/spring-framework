package com.gara;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author GARA
 */
@Controller
public class AppController {

	@Autowired
	private AppConfig appConfig;

	@RequestMapping(value = "index")
	public String index(){
		System.out.println("This is AppController" + ":" +appConfig.getName());
		return "index";
	}
}
