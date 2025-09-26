package quizCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayQuiz {
    public static void main(String[] args) {
        QuestionService qs = new QuestionService();
        Scanner sc = new Scanner(System.in);
        ExampleQuestions eq = new ExampleQuestions();

        qs.prepareQuestions();

//        qs.displayQuestions();

        List<String> answers= new ArrayList<>();


        int i=0;

        int score = 0;
        while(i<qs.q.length){
            System.out.println("Question "+(i+1)+" : " );
            System.out.println(qs.getQuestion(i));
            answers.add(i, sc.nextLine().toLowerCase().trim());
            if(qs.getAnswer(i).equals(answers.get(i))) score++;
            i++;
        }

        for(String ans : answers){
            System.out.println(ans);
        }
        switch(score){
            case 1: System.out.println("- One correct -"); break;
            case 2: System.out.println("-- Two correct --"); break;
            case 3: System.out.println("--- Three correct ---"); break;
            case 4: System.out.println("---- Four correct ----"); break;
            case 5: System.out.println("----- All correct -----"); break;

        }



    }
}
