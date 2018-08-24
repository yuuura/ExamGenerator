package ExamGenerator;

enum MathOperationSimple {

    ADD("+"), DIVISION("/"), SUBTRACTION("-"), MULTIPLICATION("*");

    private final String strOp;

    MathOperationSimple(String strOp) {
        this.strOp = strOp;
    }

    @Override
    public String toString() {
        return strOp;
    }
}
