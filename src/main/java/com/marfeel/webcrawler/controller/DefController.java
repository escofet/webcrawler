package com.marfeel.webcrawler.controller;
/*
Spring controller, api
*/
import java.io.IOException;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.marfeel.crawler.model.Message;

@Controller
public class DefController {
	@RequestMapping(value="/def", method = RequestMethod.GET)
	@ResponseBody
	public Message def(HttpServletRequest req, HttpServletResponse response) throws IOException {
		return new Message("That's all folks", req.getParameter("name"));
	}
	
	@RequestMapping(value="/def/{name}", method = RequestMethod.GET)
	@ResponseBody
	public String str(@PathVariable("name") String username, @RequestParam(value = "date", required = false) Date dateOrNull) throws IOException {
		// Some code to deal with dateOrNull
		return "So long friend " + username;
	}
}
