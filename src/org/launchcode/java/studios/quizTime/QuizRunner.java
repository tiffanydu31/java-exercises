package org.launchcode.java.studios.quizTime;

import java.util.ArrayList;

/**
 * Created by lucke on 6/1/2017.
 */
public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        TrueOrFalse one = new TrueOrFalse("TrueOrFalse", "Is this True?", 1, true);
        ArrayList<String> list = new ArrayList<>();
        list.add("answer one");
        list.add("answer two");
        MultipleChoice two = new MultipleChoice("MultipleChoice", "Which one is right?", 2, list, 1);

        quiz.addQuestion(one);
        quiz.addQuestion(two);

        quiz.startQuiz();

    }
}
