package Lesson8_HomeWork;

public class DefinitionResult {
    private int result;
    private String action;
    private final int[] buffNum = new int[2];

    public DefinitionResult(int result, String action) {
        this.result = result;
        this.action = action;
    }

    public int getResult() {
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
        }
        return result;
    }

    public void clearBuff (){
        for (int i = 0; i < buffNum.length; i++) {
            buffNum[i] = 0;
        }
    }

    public void fillBuff (int num){
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

            default:
                break;
        } return false;
    }

}
