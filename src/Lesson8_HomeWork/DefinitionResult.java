package Lesson8_HomeWork;

public class DefinitionResult {
    private int result;
    private String action;
    private int num;
    private int[] buffNum = new int[2];


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
        }
        for (int i = 0; i < buffNum.length; i++) {
            buffNum[i] = 0;
        }
        return result;
    }

    public void fillBuff (int num){
        for (int i = 0; i < buffNum.length; i++) {
            if (buffNum[i] == 0){
               buffNum[i]=num;
               result = 0;
               break;
            }
        }
    }
    public boolean checkAction (String act){
        int res;
        switch (act) {
            case "+":
                action = "sum";
                return true;
                //break;
            case "-":
                action = "sub";
                return true;
                //break;
            //case "=":
            //    res = getResult();
            //    System.out.println(res);

            default:
                break;
        } return false;
    }

}
