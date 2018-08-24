package ExamGenerator;

import lombok.Builder;

import java.util.ArrayList;
import java.util.List;

public class MathExam implements Exam{

    private int amntExp;
    private MathExpType mathExpType;
    private List<String> listExam;

    @Builder
    MathExam(int amntExp, MathExpType mathExpType){
        this.amntExp = amntExp;
        this.mathExpType = mathExpType;
        init();
    }

    private void init(){
        listExam = new ArrayList<>();
    }

    @Override
    public List<String> generateExam() {
        return genMathExpression();
    }

    private List<String> genMathExpression() {
        for(int i = 0; i < amntExp; i++){
            listExam.add(mathExpType.genMathExpression());
        }
        return listExam;
    }
}
