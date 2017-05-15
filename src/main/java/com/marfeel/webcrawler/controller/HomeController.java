package com.marfeel.webcrawler.controller;
/*
	Spring controller, model-view
*/
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.marfeel.crawler.model.Message;

@Controller
public class HomeController {
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException {
		Message myMessage = new Message("Bienvenido", "Pepe");
		return new ModelAndView("home", "salutate", myMessage);
	}
	
	@RequestMapping(value="/bye")
	public ModelAndView byebye(HttpServletResponse response) throws IOException {
		return new ModelAndView("/another/bye", "goodbye", "Pepe");
	}
}
	