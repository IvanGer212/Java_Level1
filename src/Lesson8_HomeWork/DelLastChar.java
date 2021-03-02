package Lesson8_HomeWork;

public class DelLastChar {
    private String textField;

    public DelLastChar(String textField) {
        this.textField = textField;
    }

    public String createNewString(String textField) {
        if (!textField.equals("")) {
            return textField.substring(0, textField.length() - 1);
        } else {
            return "";
        }
    }
}
