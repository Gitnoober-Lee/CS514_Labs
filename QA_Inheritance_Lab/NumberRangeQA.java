package QA_Inheritance_Lab;

/**
 * @Description:
 * @Title: NumberRangeQA
 * @Package lab_QA_Inheritance_Lab
 * @Author: lijunpeng@cmhi.chinamobile.com
 * @CreateTime: 9/27/23 11:39 AM
 */
public class NumberRangeQA extends QA {

    public Integer intAnswer;
    public Integer range;

    public NumberRangeQA(String question, int answer, int range) {
        super(question, answer + "");
        intAnswer = answer;
        this.range = range;
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        int answer = Integer.parseInt(userAnswer);
        int max = intAnswer + range;
        int min = intAnswer - range;
        if (answer >= min && answer <= max) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void displayQuestion() {
        super.displayQuestion();
        System.out.println("within: " + range);
    }
}
