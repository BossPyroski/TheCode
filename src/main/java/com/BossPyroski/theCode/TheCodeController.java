package com.BossPyroski.theCode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TheCodeController {
	
		@RequestMapping("/")
		public String helloo(Model model) {

			return "index.jsp";
		
		}
		@RequestMapping("/code")
		public String code(Model model) {
			return "theCode.jsp";
		}
		@RequestMapping(value="/code", method=RequestMethod.POST)
		public String bushido(@RequestParam(value="code") String code) {
			if  ((code).equals("Bushido")) {
				return "redirect:/code";
		}
			else {
				return "Index.jsp";
			}
		}
		
	}

