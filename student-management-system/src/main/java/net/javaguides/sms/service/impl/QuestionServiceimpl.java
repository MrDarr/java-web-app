package net.javaguides.sms.service.impl;
import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.sms.entity.Question;
import net.javaguides.sms.service.QuestionService;

import net.javaguides.sms.repository.QuestionRepository;


@Service
public class QuestionServiceimpl implements QuestionService {

	
	
	private QuestionRepository questionRepository;
	
	public QuestionServiceimpl(net.javaguides.sms.repository.QuestionRepository questionRepository) {
		super();
		this.questionRepository = questionRepository;
	}
	
	@Override
	public List<Question> getAllQuestions() {
		
		
		
		
		
		return questionRepository.findAll();
		
	}

	@Override
	public Question saveQuestion(Question question) {
	
		return questionRepository.save(question);
	}

	@Override
	public Question displayAnswerForYes(Question yes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Question displayAnswerForNo(Question no) {
		// TODO Auto-generated method stub
		return null;
	}





	
	
	
	
}
