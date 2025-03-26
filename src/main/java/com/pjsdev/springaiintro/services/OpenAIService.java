package com.pjsdev.springaiintro.services;

import com.pjsdev.springaiintro.model.Answer;
import com.pjsdev.springaiintro.model.Question;

public interface OpenAIService {

    String getAnswer(String question);

    Answer getAnswer(Question question);
}
