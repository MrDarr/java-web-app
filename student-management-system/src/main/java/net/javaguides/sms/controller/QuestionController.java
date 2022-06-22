package net.javaguides.sms.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.sms.entity.Question;
import net.javaguides.sms.service.QuestionService;

@Controller
public class QuestionController {

	
	private QuestionService questionService;

	public QuestionController(QuestionService questionService) {
		super();
		this.questionService = questionService;
	}
	
	
	@GetMapping("/questions")
	public String listQuestions(Model model){
		model.addAttribute("questions",questionService.getAllQuestions());
		return "questions";
		
		
		
	}
	
	@GetMapping("/questions/new")
	public String createQuestionForm(Model model) {
		Question question = new Question();
		model.addAttribute("question",question);
		return "create_questions";
	}
	
	@PostMapping("/questions")
	public String saveQuesion(@ModelAttribute("question") Question question) {
		
		questionService.saveQuestion(question);
		return "redirect:/questions";
	}
	
//	@RequestMapping("/questions")
//	public String start(HttpSession session) {
//		session.setAttribute("yes", session);
//		return "questions";
//	}
	
	
}
