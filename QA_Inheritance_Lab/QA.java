package QA_Inheritance_Lab;

/**
 * @Description:
 * @Title: QA
 * @Package lab_QA_Inheritance_Lab
 * @Author: lijunpeng@cmhi.chinamobile.com
 * @CreateTime: 9/27/23 11:37 AM
 */
public class QA {
    protected String question;
    protected String answer;

    public QA(String q, String a) {
        this.question = q;
        this.answer = a;
    }

    public void displayQuestion() {
        System.out.println(question);
    }

    public boolean checkAnswer(String userAnswer) {
        return this.answer.equals(userAnswer);
    }

    public void displayAnswer() {
        System.out.println("The correct answer is:" + answer);
    }
}
