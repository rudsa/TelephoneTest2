package action;

import module.TelephoneButtons;

public class TelephoneButtonPress {

    private String pressNumberButton = "";

    public String pressButton(String pressNumber){
        for(int i=0; i<pressNumber.length(); i++){
            switch (pressNumber.charAt(i)){
                case '0':{
                    pressNumberButton += TelephoneButtons.valueOf("Zero").getButtonNum();
                    break;
                }
                case '1':{
                    pressNumberButton += TelephoneButtons.valueOf("One").getButtonNum();
                    break;
                }
                case '2':{
                    pressNumberButton += TelephoneButtons.valueOf("Two").getButtonNum();
                    break;
                }
                case '3':{
                    pressNumberButton += TelephoneButtons.valueOf("Three").getButtonNum();
                    break;
                }
                case '4':{
                    pressNumberButton += TelephoneButtons.valueOf("Four").getButtonNum();
                    break;
                }
                case '5':{
                    pressNumberButton += TelephoneButtons.valueOf("Five").getButtonNum();
                    break;
                }
                case '6':{
                    pressNumberButton += TelephoneButtons.valueOf("Six").getButtonNum();
                    break;
                }
                case '7':{
                    pressNumberButton += TelephoneButtons.valueOf("Seven").getButtonNum();
                    break;
                }
                case '8':{
                    pressNumberButton += TelephoneButtons.valueOf("Eight").getButtonNum();
                    break;
                }
                case '9':{
                    pressNumberButton += TelephoneButtons.valueOf("Nine").getButtonNum();
                    break;
                }
                case '*':{
                    pressNumberButton += TelephoneButtons.valueOf("Asterisk").getButtonNum();
                    break;
                }
                case '#':{
                    pressNumberButton += TelephoneButtons.valueOf("Sharp").getButtonNum();
                    break;
                }
                default:{
                    break;
                }
            }
        }
        return pressNumberButton;
    }
}
