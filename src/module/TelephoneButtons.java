package module;

public enum TelephoneButtons {
    Zero("0"),
    One("1"),
    Two("2"),
    Three("3"),
    Four("4"),
    Five("5"),
    Six("6"),
    Seven("7"),
    Eight("8"),
    Nine("9"),
    Asterisk("*"),
    Sharp("#");

    private String buttonNum;

    private TelephoneButtons(String buttonNum){
        this.buttonNum = buttonNum;
    }

    public String getButtonNum(){
        return buttonNum;
    }
}
