package ExamGenerator;

public class Main {
    public static void main(String[] args) {

        ExamGenerator exam = new ExamGenerator();

        exam.setExam(new MathExam(10,
                        MathExpTypeSimple.builder()
                                .min(0)
                                .max(100)
                                .amntNumEachExp(3)
                                .operation(MathOperationSimple.class)
                                .build())
        );

        exam.createExam();
    }
}
