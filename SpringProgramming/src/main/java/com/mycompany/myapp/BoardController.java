package com.mycompany.myapp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping("/board/list")
	
	public String list(){
		logger.info("list");
		return "list";
	}
	@RequestMapping("/board/writeform")
	public String writeform(){
		logger.info("writeform");
		return "writeForm";
	}
	
	@RequestMapping("/board/update")
	public String update(){
		logger.info("update");
		return "update";
	}
}
