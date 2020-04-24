package com.gara;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author GARA
 */
@Controller
public class AppController {

	@RequestMapping(value = "index")
	public String index(){
		System.out.println("This is AppController");
		return "index";
	}
}
