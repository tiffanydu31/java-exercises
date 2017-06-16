package org.launchcode.java.studios.quizTime;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lucke on 6/1/2017.
 */
public class Quiz {

    private int correct = 0;
    private int total = 0;
    private ArrayList<Question> questions;

    public Quiz(){
        questions = new ArrayList<Question>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
        total += question.mPoints;
    }

    public void startQuiz() {
        for (Question q : questions) {
            q.askQuestion();
            System.out.println("\nAnswer:" );
            switch (q.mType) {
                case "MultipleChoice":
                    ((MultipleChoice) q).printChoices();
                    break;
                case "Checkbox":
                    ((Checkbox) q).printChoices();
                    break;
                case "TrueOrFalse":
                    ((TrueOrFalse) q).printChoices();
                    break;
            }
        }
    }

    public String gradeQuiz() {
        return correct + "/" + total;
    }

}
