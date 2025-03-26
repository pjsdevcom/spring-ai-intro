package com.pjsdev.springaiintro.controllers;

import com.pjsdev.springaiintro.model.Answer;
import com.pjsdev.springaiintro.model.Question;
import com.pjsdev.springaiintro.services.OpenAIService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

    private final OpenAIService openAIService;

    public QuestionController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @PostMapping
    public Answer askQuestion(Question question) {
        return openAIService.getAnswer(question);
    }
}
