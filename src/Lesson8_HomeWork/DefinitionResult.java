package Lesson8_HomeWork;

public class DefinitionResult {
    private double result;
    private String action;
    private final double[] buffNum = new double[2];

    public DefinitionResult(double result, String action) {
        this.result = result;
        this.action = action;
    }

    public double getResult() {
        switch (action){
            case "sum":
                result = buffNum[0]+buffNum[1];
                break;
            case "sub":
                result = buffNum[0] - buffNum[1];
                break;
            case "multi":
                result = buffNum[0] * buffNum[1];
                break;
            case "div":
                if (buffNum[1] != 0) {
                    result = buffNum[0] / buffNum[1];
                } else System.out.println("Error");
                break;
            case "pow":
                result = Math.pow(buffNum[0],buffNum[1]);
                break;
            case "sqrt":
                result = Math.sqrt(buffNum[0]);
                break;
        }
        return result;
    }

    public void clearBuff (){
        for (int i = 0; i < buffNum.length; i++) {
            buffNum[i] = 0;
        }
    }

    public void fillBuff (double num){
        for (int i = 0; i < buffNum.length; i++) {
            if (buffNum[i] == 0){
               buffNum[i] = num;
               result = 0;
               break;
            }
        }
    }
    public boolean checkAction (String act){
        switch (act) {
            case "+":
                action = "sum";
                return true;
            case "-":
                action = "sub";
                return true;
            case "*":
                action = "multi";
                return true;
            case "/":
                action = "div";
                return true;
            case "^":
                action = "pow";
                return true;
            case "SQRT":
                action = "sqrt";
                break;
            default:
                break;
        } return false;
    }

}
