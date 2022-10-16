package com.example.demo;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private AnswerRepository answerRepository;
	private QuestionRepository questionRepository;

	@Test
	void testJpa() {
		Optional<Question> oq = this.questionRepository.findById(0);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		
		Answer a = new Answer();
		a.setContent("네 자동으로 생성됩니다.");
		a.setQuestion(q); //
		a.setCreateDate(LocalDateTime.now());
		this.answerRepository.save(a);
		
		
	}
}

//답변 데이터 생성 후 저장하기부터

//https://wikidocs.net/160890#findbysubject