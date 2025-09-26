package quizCode;

public class QuestionService {

    Questions[] q = new Questions[5];
    ExampleQuestions eq = new ExampleQuestions();



    public void prepareQuestions(){
        for(int i = 0; i<5; i++){
            int random = (int) (Math.random()* (5-1)+1) + 1 ;

            q[i]= new Questions((i+1), eq.questions[random], eq.answers[random].toLowerCase());
        }
    }

    public String getQuestion(int n){
        return q[n].getQuestion();
    }

    public String getAnswer(int n){
        return q[n].getAnswer();
    }

    public void displayQuestions() {
        for (Questions que : q) {
            System.out.println(que.getQuesId() + " " + que.getQuestion() + " " + que.getAnswer());

        }

    }
//        Questions A = new Questions()




}
