package action;

import module.TelephoneButtons;

public class TelephoneButtonPress {
    private String pressNumber = "";

    public void setPressNumber(String pressNumber){
        this.pressNumber = pressNumber;
    }

    public void pressButton(){
        switch ("1"){
            case "0":{
                System.out.println(TelephoneButtons.valueOf("Zero"));
                break;
            }
            case "1":{
                System.out.println(TelephoneButtons.valueOf("One"));
                break;
            }
            case "2":{
                System.out.println(TelephoneButtons.valueOf("Two"));
                break;
            }
            case "3":{
                System.out.println(TelephoneButtons.valueOf("Three"));
                break;
            }
            case "4":{
                System.out.println(TelephoneButtons.valueOf("Four"));
                break;
            }
            case "5":{
                System.out.println(TelephoneButtons.valueOf("Five"));
                break;
            }
            case "6":{
                System.out.println(TelephoneButtons.valueOf("Six"));
                break;
            }
            case "7":{
                System.out.println(TelephoneButtons.valueOf("Seven"));
                break;
            }
            case "8":{
                System.out.println(TelephoneButtons.valueOf("Eight"));
                break;
            }
            case "9":{
                System.out.println(TelephoneButtons.valueOf("Nine"));
                break;
            }
            case "*":{
                System.out.println(TelephoneButtons.valueOf("Asterisk"));
                break;
            }
            case "#":{
                System.out.println(TelephoneButtons.valueOf("Sharp"));
                break;
            }
            default:{
                break;
            }
        }
    }
}
