package quizCode;

public class Questions {

    private String question;
    private int quesId;
    private String answer;

    public Questions( int quesId, String question,String answer) {
        this.question = question;
        this.quesId = quesId;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getQuesId() {
        return quesId;
    }

    public void setQuesId(int quesId) {
        this.quesId = quesId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
