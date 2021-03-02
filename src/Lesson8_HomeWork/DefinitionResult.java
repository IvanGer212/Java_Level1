package Lesson8_HomeWork;

public class DefinitionResult {
    private double result;
    private String action;
    private final double[] buffNum = new double[2];
    private boolean error;

    public DefinitionResult(double result, String action) {
        this.result = result;
        this.action = action;
    }

    public double getResult(String lastComand) {
        switch (lastComand){
            case "+":
                result = buffNum[0] + buffNum[1];
                break;
            case "-":
                result = buffNum[0] - buffNum[1];
                break;
            case "*":
                result = buffNum[0] * buffNum[1];
                break;
            case "/":
                if (buffNum[1] != 0) {
                    result = buffNum[0] / buffNum[1];
                } else {
                    error = true;
                }
                break;
            case "^":
                result = Math.pow(buffNum[0],buffNum[1]);
                break;
            case "SQRT":
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
            case "-":
            case "*":
            case "/":
            case "^":
                return true;
            //case "SQRT":
            //    action = "sqrt";
            //    break;
            default:
                break;
        } return false;
    }

    public boolean isError() {
        return error;
    }
    public void acknowledgeError(){
        error = false;
    }
}
