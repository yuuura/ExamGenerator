package ExamGenerator;

import java.util.List;

public class ExamGenerator {

    private Exam exam;

    public void setExam(Exam exam){
        this.exam = exam;
    }

    public void createExam(){
        List<String> listExp = exam.generateExam();
        for(String exp : listExp)
            System.out.println(exp);
    }
}
