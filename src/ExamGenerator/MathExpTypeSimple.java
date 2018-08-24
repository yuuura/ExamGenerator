package ExamGenerator;

import lombok.Builder;
import lombok.SneakyThrows;

import java.util.Random;

public class MathExpTypeSimple implements MathExpType{

    private int min;
    private int max;
    private int amntNumEachExp;
    private Class operation;

    @Builder
    MathExpTypeSimple(int min, int max, int amntNumEachExp, Class operation){

        this.min = min;
        this.max = max;
        this.amntNumEachExp = amntNumEachExp;
        this.operation = operation;
        validateParam();
    }

    @SneakyThrows
    private void validateParam(){
        if(amntNumEachExp < 2)
            throw new Exception("Expression must consist at least of 2 numbers");
        if(!operation.isEnum())
            throw new Exception("Only enum accepted");
    }

    @Override
    public String genMathExpression(){
        Random r = new Random();
        Object[] values = operation.getEnumConstants();
        String exp = String.valueOf(r.nextInt(max - min) + min);
        exp += " " + values[r.nextInt(values.length)].toString();
        exp += " " + String.valueOf(r.nextInt(max - min) + min);
        if(amntNumEachExp > 2){
            for (int i = 2; i < amntNumEachExp; i++){
                exp +=" " + values[r.nextInt(values.length)].toString();
                exp += " " + String.valueOf(r.nextInt(max - min) + min);
            }
        }
        exp += " = ";
        return exp;
    }

}
